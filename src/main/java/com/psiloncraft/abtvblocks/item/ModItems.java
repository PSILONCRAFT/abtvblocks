package com.psiloncraft.abtvblocks.item;

import com.psiloncraft.abtvblocks.abtvblocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item PSILONIUM_INGOT = registerItem("psilonium_ingot",
                new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PSILONIUM_NUGGET = registerItem("psilonium_nugget",
                new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(abtvblocks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + abtvblocks.MOD_ID);
    }
}