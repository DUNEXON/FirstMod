package net.dunexon.dunexonfirstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import static net.dunexon.dunexonfirstmod.util.FirstModRegistry.registerItem;
public class FirstModItems {
    public static final Item RUBY_ITEM = registerItem("ruby", new RubyItem( new FabricItemSettings() ));

    public static void init() {}
}
