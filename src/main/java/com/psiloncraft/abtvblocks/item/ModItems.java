package com.psiloncraft.abtvblocks.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import com.psiloncraft.abtvblocks.abtvblocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MANGROVE_SAPLING = registerItem("mangrove_sapling", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item name);
        return Registry.register(Registry.ITEM, new Identifier(abtvblocks.MOD_ID, name), item);

    public static void  registerModItems(){
        System.out.println("Registering Mod Item for " + abtvblocks.MOD_ID);
    }
}
