package com.aryamehta227.opitemsmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpItemsMod implements ModInitializer {
    public static final String MOD_ID = "opitemsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item OP_SWORD = new Item(new Item.Settings().maxCount(1));
    public static final Item OP_PICKAXE = new Item(new Item.Settings().maxCount(1));
    public static final Item OP_AXE = new Item(new Item.Settings().maxCount(1));
    public static final Item OP_SHOVEL = new Item(new Item.Settings().maxCount(1));
    public static final Item OP_HOE = new Item(new Item.Settings().maxCount(1));
    public static final Item OP_HELMET = new Item(new Item.Settings().maxCount(1));
    public static final Item OP_CHESTPLATE = new Item(new Item.Settings().maxCount(1));
    public static final Item OP_LEGGINGS = new Item(new Item.Settings().maxCount(1));
    public static final Item OP_BOOTS = new Item(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing OpItemsMod");

        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "op_sword"), OP_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "op_pickaxe"), OP_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "op_axe"), OP_AXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "op_shovel"), OP_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "op_hoe"), OP_HOE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "op_helmet"), OP_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "op_chestplate"), OP_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "op_leggings"), OP_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "op_boots"), OP_BOOTS);
    }
}