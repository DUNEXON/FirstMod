package net.dunexon.dunexonfirstmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
public class RubyItem extends Item {
    public RubyItem(Settings settings) {
        super(settings);
        settings.group(ItemGroup.MATERIALS);
    }
}
