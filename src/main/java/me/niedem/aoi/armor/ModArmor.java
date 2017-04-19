package me.niedem.aoi.armor;

import me.niedem.aoi.ittgardMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor {

    //declaring armor
    //cloth
    public static Item clothHelmet;
    public static Item clothChestplate;
    public static Item clothLeggings;
    public static Item clothBoots;
    //lightpadded
    public static Item lightpaddedHelmet;
    public static Item lightpaddedChestplate;
    public static Item lightpaddedLeggings;
    public static Item lightpaddedBoots;
    //lamellar
    public static Item lamellarHelmet;
    public static Item lamellarChestplate;
    public static Item lamellarLeggings;
    public static Item lamellarBoots;
    //thickpadded
    public static Item thickpaddedHelmet;
    public static Item thickpaddedChestplate;
    public static Item thickpaddedLeggings;
    public static Item thickpaddedBoots;
    //plated chainmail
    public static Item platedchainHelmet;
    public static Item platedchainChestplate;
    public static Item platedchainLeggings;
    public static Item platedchainBoots;
    //brigandine
    public static Item brigandineHelmet;
    public static Item brigandineChestplate;
    public static Item brigandineLeggings;
    public static Item brigandineBoots;
    //plate armor
    public static Item plateHelmet;
    public static Item plateChestplate;
    public static Item plateLeggings;
    public static Item plateBoots;
    //scale armor
    public static Item scaleHelmet;
    public static Item scaleChestplate;
    public static Item scaleLeggings;
    public static Item scaleBoots;
    //Mithril mail
    public static Item mithrilHelmet;
    public static Item mithrilChestplate;
    public static Item mithrilLeggings;
    public static Item mithrilBoots;
    //dragonscale
    public static Item dragonscaleHelmet;
    public static Item dragonscaleChestplate;
    public static Item dragonscaleLeggings;
    public static Item dragonscaleBoots;
    //Ancient
    public static Item ancientHelmet;
    public static Item ancientChestplate;
    public static Item ancientLeggings;
    public static Item ancientBoots;
    //god
    public static Item godHelmet;
    public static Item godChestplate;
    public static Item godLeggings;
    public static Item godBoots;

    public static void preInit(){
        registerItems();
    }

    public static void registerItems(){
        //armor
        //cloth
        GameRegistry.register(clothHelmet = new ItemCustomArmor("cloth_helmet", ItemCustomArmor.CLOTH_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "cloth_helmet"));
        GameRegistry.register(clothChestplate = new ItemCustomArmor("cloth_chestplate", ItemCustomArmor.CLOTH_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "cloth_chestplate"));
        GameRegistry.register(clothLeggings = new ItemCustomArmor("cloth_leggings", ItemCustomArmor.CLOTH_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "cloth_leggings"));
        GameRegistry.register(clothBoots = new ItemCustomArmor("cloth_boots", ItemCustomArmor.CLOTH_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "cloth_boots"));
        //lightpadded
        GameRegistry.register(lightpaddedHelmet = new ItemCustomArmor("lightpadded_helmet", ItemCustomArmor.LIGHTPADDED_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "lightpadded_helmet"));
        GameRegistry.register(lightpaddedChestplate = new ItemCustomArmor("lightpadded_chestplate", ItemCustomArmor.LIGHTPADDED_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "lightpadded_chestplate"));
        GameRegistry.register(lightpaddedLeggings = new ItemCustomArmor("lightpadded_leggings", ItemCustomArmor.LIGHTPADDED_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "lightpadded_leggings"));
        GameRegistry.register(lightpaddedBoots = new ItemCustomArmor("lightpadded_boots", ItemCustomArmor.LIGHTPADDED_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "lightpadded_boots"));
        //lamellar
        GameRegistry.register(lamellarHelmet = new ItemCustomArmor("lamellar_helmet", ItemCustomArmor.LAMELLAR_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "lamellar_helmet"));
        GameRegistry.register(lamellarChestplate = new ItemCustomArmor("lamellar_chestplate", ItemCustomArmor.LAMELLAR_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "lamellar_chestplate"));
        GameRegistry.register(lamellarLeggings = new ItemCustomArmor("lamellar_leggings", ItemCustomArmor.LAMELLAR_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "lamellar_leggings"));
        GameRegistry.register(lamellarBoots = new ItemCustomArmor("lamellar_boots", ItemCustomArmor.LAMELLAR_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "lamellar_boots"));
        //thickpadded
        GameRegistry.register(thickpaddedHelmet = new ItemCustomArmor("thickpadded_helmet", ItemCustomArmor.THICKPADDED_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "thickpadded_helmet"));
        GameRegistry.register(thickpaddedChestplate = new ItemCustomArmor("thickpadded_chestplate", ItemCustomArmor.THICKPADDED_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "thickpadded_chestplate"));
        GameRegistry.register(thickpaddedLeggings = new ItemCustomArmor("thickpadded_leggings", ItemCustomArmor.THICKPADDED_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "thickpadded_leggings"));
        GameRegistry.register(thickpaddedBoots = new ItemCustomArmor("thickpadded_boots", ItemCustomArmor.THICKPADDED_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "thickpadded_boots"));
        //platedchain
        GameRegistry.register(platedchainHelmet = new ItemCustomArmor("platedchain_helmet", ItemCustomArmor.PLATEDCHAINMAIL_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "platedchain_helmet"));
        GameRegistry.register(platedchainChestplate = new ItemCustomArmor("platedchain_chestplate", ItemCustomArmor.PLATEDCHAINMAIL_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "platedchain_chestplate"));
        GameRegistry.register(platedchainLeggings = new ItemCustomArmor("platedchain_leggings", ItemCustomArmor.PLATEDCHAINMAIL_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "platedchain_leggings"));
        GameRegistry.register(platedchainBoots = new ItemCustomArmor("platedchain_boots", ItemCustomArmor.PLATEDCHAINMAIL_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "platedchain_boots"));
        //brigandine
        GameRegistry.register(brigandineHelmet = new ItemCustomArmor("brigandine_helmet", ItemCustomArmor.BRIGANDINE_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "brigandine_helmet"));
        GameRegistry.register(brigandineChestplate = new ItemCustomArmor("brigandine_chestplate", ItemCustomArmor.BRIGANDINE_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "brigandine_chestplate"));
        GameRegistry.register(brigandineLeggings = new ItemCustomArmor("brigandine_leggings", ItemCustomArmor.BRIGANDINE_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "brigandine_leggings"));
        GameRegistry.register(brigandineBoots = new ItemCustomArmor("brigandine_boots", ItemCustomArmor.BRIGANDINE_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "brigandine_boots"));
        //plate
        GameRegistry.register(plateHelmet = new ItemCustomArmor("plate_helmet", ItemCustomArmor.PLATE_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "plate_helmet"));
        GameRegistry.register(plateChestplate = new ItemCustomArmor("plate_chestplate", ItemCustomArmor.PLATE_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "plate_chestplate"));
        GameRegistry.register(plateLeggings = new ItemCustomArmor("plate_leggings", ItemCustomArmor.PLATE_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "plate_leggings"));
        GameRegistry.register(plateBoots = new ItemCustomArmor("plate_boots", ItemCustomArmor.PLATE_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "plate_boots"));
        //scale
        GameRegistry.register(scaleHelmet = new ItemCustomArmor("scale_helmet", ItemCustomArmor.SCALE_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "scale_helmet"));
        GameRegistry.register(scaleChestplate = new ItemCustomArmor("scale_chestplate", ItemCustomArmor.SCALE_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "scale_chestplate"));
        GameRegistry.register(scaleLeggings = new ItemCustomArmor("scale_leggings", ItemCustomArmor.SCALE_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "scale_leggings"));
        GameRegistry.register(scaleBoots = new ItemCustomArmor("scale_boots", ItemCustomArmor.SCALE_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "scale_boots"));
        //mithril
        GameRegistry.register(mithrilHelmet = new ItemCustomArmor("mithril_helmet", ItemCustomArmor.MITHRIL_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "mithril_helmet"));
        GameRegistry.register(mithrilChestplate = new ItemCustomArmor("mithril_chestplate", ItemCustomArmor.MITHRIL_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "mithril_chestplate"));
        GameRegistry.register(mithrilLeggings = new ItemCustomArmor("mithril_leggings", ItemCustomArmor.MITHRIL_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "mithril_leggings"));
        GameRegistry.register(mithrilBoots = new ItemCustomArmor("mithril_boots", ItemCustomArmor.MITHRIL_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "mithril_boots"));
        //dragonscale
        GameRegistry.register(dragonscaleHelmet = new ItemCustomArmor("dragonscale_helmet", ItemCustomArmor.DRAGONSCALE_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "dragonscale_helmet"));
        GameRegistry.register(dragonscaleChestplate = new ItemCustomArmor("dragonscale_chestplate", ItemCustomArmor.DRAGONSCALE_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "dragonscale_chestplate"));
        GameRegistry.register(dragonscaleLeggings = new ItemCustomArmor("dragonscale_leggings", ItemCustomArmor.DRAGONSCALE_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "dragonscale_leggings"));
        GameRegistry.register(dragonscaleBoots = new ItemCustomArmor("dragonscale_boots", ItemCustomArmor.DRAGONSCALE_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "dragonscale_boots"));
        //ancient
        GameRegistry.register(ancientHelmet = new ItemCustomArmor("ancient_helmet", ItemCustomArmor.ANCIENT_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "ancient_helmet"));
        GameRegistry.register(ancientChestplate = new ItemCustomArmor("ancient_chestplate", ItemCustomArmor.ANCIENT_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "ancient_chestplate"));
        GameRegistry.register(ancientLeggings = new ItemCustomArmor("ancient_leggings", ItemCustomArmor.ANCIENT_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "ancient_leggings"));
        GameRegistry.register(ancientBoots = new ItemCustomArmor("ancient_boots", ItemCustomArmor.ANCIENT_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "ancient_boots"));
        //god
        GameRegistry.register(godHelmet = new ItemCustomArmor("god_helmet", ItemCustomArmor.GOD_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "god_helmet"));
        GameRegistry.register(godChestplate = new ItemCustomArmor("god_chestplate", ItemCustomArmor.GOD_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "god_chestplate"));
        GameRegistry.register(godLeggings = new ItemCustomArmor("god_leggings", ItemCustomArmor.GOD_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "god_leggings"));
        GameRegistry.register(godBoots = new ItemCustomArmor("god_boots", ItemCustomArmor.GOD_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "god_boots"));

    }

    //setting texture for rendering
    public static void registerRenders(){
        //cloth
        registerRender(clothHelmet);
        registerRender(clothChestplate);
        registerRender(clothLeggings);
        registerRender(clothBoots);
        //lightpadded
        registerRender(lightpaddedHelmet);
        registerRender(lightpaddedChestplate);
        registerRender(lightpaddedLeggings);
        registerRender(lightpaddedBoots);
        //lamellar
        registerRender(lamellarHelmet);
        registerRender(lamellarChestplate);
        registerRender(lamellarLeggings);
        registerRender(lamellarBoots);
        //thickpadded
        registerRender(thickpaddedHelmet);
        registerRender(thickpaddedChestplate);
        registerRender(thickpaddedLeggings);
        registerRender(thickpaddedBoots);
        //platedchain
        registerRender(platedchainHelmet);
        registerRender(platedchainChestplate);
        registerRender(platedchainLeggings);
        registerRender(platedchainBoots);
        //brigandine
        registerRender(brigandineHelmet);
        registerRender(brigandineChestplate);
        registerRender(brigandineLeggings);
        registerRender(brigandineBoots);
        //plate
        registerRender(plateHelmet);
        registerRender(plateChestplate);
        registerRender(plateLeggings);
        registerRender(plateBoots);
        //scale
        registerRender(scaleHelmet);
        registerRender(scaleChestplate);
        registerRender(scaleLeggings);
        registerRender(scaleBoots);
        //mithril
        registerRender(mithrilHelmet);
        registerRender(mithrilChestplate);
        registerRender(mithrilLeggings);
        registerRender(mithrilBoots);
        //dragonscale
        registerRender(dragonscaleHelmet);
        registerRender(dragonscaleChestplate);
        registerRender(dragonscaleLeggings);
        registerRender(dragonscaleBoots);
        //ancient
        registerRender(ancientHelmet);
        registerRender(ancientChestplate);
        registerRender(ancientLeggings);
        registerRender(ancientBoots);
        //god
        registerRender(godHelmet);
        registerRender(godChestplate);
        registerRender(godLeggings);
        registerRender(godBoots);

    }
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ittgardMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
