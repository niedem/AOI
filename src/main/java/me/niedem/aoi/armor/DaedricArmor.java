package me.niedem.aoi.armor;

import me.niedem.aoi.ittgardMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class DaedricArmor extends ItemArmor{

    //default
    public static Item daedricHelmet;
    public static Item daedricChestplate;
    public static Item daedricLeggings;
    public static Item daedricBoots;

    //fire res
    public static Item daedricHelmetFire;
    public static Item daedricChestplateFire;
    public static Item daedricLeggingsFire;
    public static Item daedricBootsFire;

    //regen
    public static Item daedricHelmetRegen;
    public static Item daedricChestplateRegen;
    public static Item daedricLeggingsRegen;
    public static Item daedricBootsRegen;

    //saturation
    public static Item daedricHelmetSat;
    public static Item daedricChestplateSat;
    public static Item daedricLeggingsSat;
    public static Item daedricBootsSat;

    //Speed
    public static Item daedricHelmetSpeed;
    public static Item daedricChestplateSpeed;
    public static Item daedricLeggingsSpeed;
    public static Item daedricBootsSpeed;

    //strenght
    public static Item daedricHelmetDmg;
    public static Item daedricChestplateDmg;
    public static Item daedricLeggingsDmg;
    public static Item daedricBootsDmg;

    //flight?
    public static Item daedricHelmetFly;
    public static Item daedricChestplateFly;
    public static Item daedricLeggingsFly;
    public static Item daedricBootsFly;

    public static void preInit() {
        GameRegistry.register(daedricHelmet = new ItemCustomArmor("daedric_helmet", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "daedric_helmet"));
        GameRegistry.register(daedricChestplate = new ItemCustomArmor("daedric_chestplate", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "daedric_chestplate"));
        GameRegistry.register(daedricLeggings = new ItemCustomArmor("daedric_leggings", ItemCustomArmor.DAEDRIC_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "daedric_leggings"));
        GameRegistry.register(daedricBoots = new ItemCustomArmor("daedric_boots", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "daedric_boots"));

        GameRegistry.register(daedricHelmetFire = new ItemCustomArmor("daedric_helmet_fire", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "daedric_helmet_fire"));
        GameRegistry.register(daedricChestplateFire = new ItemCustomArmor("daedric_chestplate_fire", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "daedric_chestplate_fire"));
        GameRegistry.register(daedricLeggingsFire = new ItemCustomArmor("daedric_leggings_fire", ItemCustomArmor.DAEDRIC_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "daedric_leggings_fire"));
        GameRegistry.register(daedricBootsFire = new ItemCustomArmor("daedric_boots_fire", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "daedric_boots_fire"));

        GameRegistry.register(daedricHelmetRegen = new ItemCustomArmor("daedric_helmet_regen", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "daedric_helmet_regen"));
        GameRegistry.register(daedricChestplateRegen = new ItemCustomArmor("daedric_chestplate_regen", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "daedric_chestplate_regen"));
        GameRegistry.register(daedricLeggingsRegen = new ItemCustomArmor("daedric_leggings_regen", ItemCustomArmor.DAEDRIC_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "daedric_leggings_regen"));
        GameRegistry.register(daedricBootsRegen = new ItemCustomArmor("daedric_boots_regen", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "daedric_boots_regen"));

        GameRegistry.register(daedricHelmetSat = new ItemCustomArmor("daedric_helmet_saturation", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "daedric_helmet_saturation"));
        GameRegistry.register(daedricChestplateSat = new ItemCustomArmor("daedric_chestplate_saturation", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "daedric_chestplate_saturation"));
        GameRegistry.register(daedricLeggingsSat = new ItemCustomArmor("daedric_leggings_saturation", ItemCustomArmor.DAEDRIC_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "daedric_leggings_saturation"));
        GameRegistry.register(daedricBootsSat = new ItemCustomArmor("daedric_boots_saturation", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "daedric_boots_saturation"));

        GameRegistry.register(daedricHelmetSpeed = new ItemCustomArmor("daedric_helmet_speed", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "daedric_helmet_speed"));
        GameRegistry.register(daedricChestplateSpeed = new ItemCustomArmor("daedric_chestplate_speed", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "daedric_chestplate_speed"));
        GameRegistry.register(daedricLeggingsSpeed = new ItemCustomArmor("daedric_leggings_speed", ItemCustomArmor.DAEDRIC_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "daedric_leggings_speed"));
        GameRegistry.register(daedricBootsSpeed = new ItemCustomArmor("daedric_boots_speed", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "daedric_boot_speeds"));

        GameRegistry.register(daedricHelmetDmg = new ItemCustomArmor("daedric_helmet_damage", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "daedric_helmet_damage"));
        GameRegistry.register(daedricChestplateDmg = new ItemCustomArmor("daedric_chestplate_damage", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "daedric_chestplate_damage"));
        GameRegistry.register(daedricLeggingsDmg = new ItemCustomArmor("daedric_leggings_damage", ItemCustomArmor.DAEDRIC_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "daedric_leggings_damage"));
        GameRegistry.register(daedricBootsDmg = new ItemCustomArmor("daedric_boots_damage", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "daedric_boots_damage"));

        GameRegistry.register(daedricHelmetFly = new ItemCustomArmor("daedric_helmet_fly", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.HEAD), new ResourceLocation(ittgardMod.MODID, "daedric_helmet_fly"));
        GameRegistry.register(daedricChestplateFly = new ItemCustomArmor("daedric_chestplate_fly", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.CHEST), new ResourceLocation(ittgardMod.MODID, "daedric_chestplate_fly"));
        GameRegistry.register(daedricLeggingsFly = new ItemCustomArmor("daedric_leggings_fly", ItemCustomArmor.DAEDRIC_ARMOR, 2, EntityEquipmentSlot.LEGS), new ResourceLocation(ittgardMod.MODID, "daedric_leggings_fly"));
        GameRegistry.register(daedricBootsFly = new ItemCustomArmor("daedric_boots_fly", ItemCustomArmor.DAEDRIC_ARMOR, 1, EntityEquipmentSlot.FEET), new ResourceLocation(ittgardMod.MODID, "daedric_boots_fly"));
    }

    public static void registerRenders() {
        ModArmor.registerRender(daedricHelmet);
        ModArmor.registerRender(daedricChestplate);
        ModArmor.registerRender(daedricLeggings);
        ModArmor.registerRender(daedricBoots);

        ModArmor.registerRender(daedricHelmetFire);
        ModArmor.registerRender(daedricChestplateFire);
        ModArmor.registerRender(daedricLeggingsFire);
        ModArmor.registerRender(daedricBootsFire);

        ModArmor.registerRender(daedricHelmetRegen);
        ModArmor.registerRender(daedricChestplateRegen);
        ModArmor.registerRender(daedricLeggingsRegen);
        ModArmor.registerRender(daedricBootsRegen);

        ModArmor.registerRender(daedricHelmetSat);
        ModArmor.registerRender(daedricChestplateSat);
        ModArmor.registerRender(daedricLeggingsSat);
        ModArmor.registerRender(daedricBootsSat);

        ModArmor.registerRender(daedricHelmetSpeed);
        ModArmor.registerRender(daedricChestplateSpeed);
        ModArmor.registerRender(daedricLeggingsSpeed);
        ModArmor.registerRender(daedricBootsSpeed);

        ModArmor.registerRender(daedricHelmetDmg);
        ModArmor.registerRender(daedricChestplateDmg);
        ModArmor.registerRender(daedricLeggingsDmg);
        ModArmor.registerRender(daedricBootsDmg);

        ModArmor.registerRender(daedricHelmetFly);
        ModArmor.registerRender(daedricChestplateFly);
        ModArmor.registerRender(daedricLeggingsFly);
        ModArmor.registerRender(daedricBootsFly);
    }


    public DaedricArmor(String unlocalizedName, ArmorMaterial material, int RenderIndex, EntityEquipmentSlot type) {
        super(material, RenderIndex, type);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ittgardMod.tabArmor);
        this.canRepair = true;
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (itemStack.getItem() == daedricBootsDmg) {
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2));
            if (player.inventory.getStackInSlot(103) == new ItemStack(daedricHelmetDmg) && player.inventory.getStackInSlot(102) == new ItemStack(daedricChestplateDmg) && player.inventory.getStackInSlot(101) == new ItemStack(daedricLeggingsDmg)){
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 200, 2));
            }
        }
        else if (player.inventory.getStackInSlot(5) == new ItemStack(daedricHelmetFire) && player.inventory.getStackInSlot(6) == new ItemStack(daedricChestplateFire) && player.inventory.getStackInSlot(7) == new ItemStack(daedricLeggingsFire)  && player.inventory.getStackInSlot(8) == new ItemStack(daedricBootsFire) ){
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 200));
        }
        else if (player.inventory.getStackInSlot(5) == new ItemStack(daedricHelmetRegen) && player.inventory.getStackInSlot(6) == new ItemStack(daedricChestplateRegen) && player.inventory.getStackInSlot(7) == new ItemStack(daedricLeggingsRegen)  && player.inventory.getStackInSlot(8) == new ItemStack(daedricBootsRegen) ){
            player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 200, 1));
        }
        else if (player.inventory.getStackInSlot(5) == new ItemStack(daedricHelmetSat) && player.inventory.getStackInSlot(6) == new ItemStack(daedricChestplateSat) && player.inventory.getStackInSlot(7) == new ItemStack(daedricLeggingsSat)  && player.inventory.getStackInSlot(8) == new ItemStack(daedricBootsSat) ){
            player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 200, 1));
        }
        else if (player.inventory.getStackInSlot(5) == new ItemStack(daedricHelmetSpeed) && player.inventory.getStackInSlot(6) == new ItemStack(daedricChestplateSpeed) && player.inventory.getStackInSlot(7) == new ItemStack(daedricLeggingsSpeed)  && player.inventory.getStackInSlot(8) == new ItemStack(daedricBootsSpeed) ){
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 200, 2));
        }

    }

    private boolean flag = true;

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event)
    {
        if(event.phase == TickEvent.Phase.START && event.side == Side.SERVER)
        {
            if(flag)
            {
                if(event.player.inventory.getStackInSlot(5) == new ItemStack(daedricHelmetFly) && event.player.inventory.getStackInSlot(6) == new ItemStack(daedricChestplateFly) && event.player.inventory.getStackInSlot(7) == new ItemStack(daedricLeggingsFly)  && event.player.inventory.getStackInSlot(8) == new ItemStack(daedricBootsFly) ){
                    flag = false;
                    event.player.capabilities.allowFlying = true;
                }
            }
            else
            {
                if(event.player.inventory.getStackInSlot(5) != new ItemStack(daedricHelmetFly) || event.player.inventory.getStackInSlot(6) != new ItemStack(daedricChestplateFly) || event.player.inventory.getStackInSlot(7) != new ItemStack(daedricLeggingsFly)  || event.player.inventory.getStackInSlot(8) != new ItemStack(daedricBootsFly) ){
                    flag = true;
                    event.player.capabilities.allowFlying = false;
                }
            }
        }
    }


}
