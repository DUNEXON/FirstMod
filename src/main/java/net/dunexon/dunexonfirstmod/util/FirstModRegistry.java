package net.dunexon.dunexonfirstmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.dunexon.dunexonfirstmod.FirstMod.MOD_ID;
public class FirstModRegistry {

    public static Item registerItem(String id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, id), item);
    }
    public static Block registerBlock(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, id), block);
    }

}
