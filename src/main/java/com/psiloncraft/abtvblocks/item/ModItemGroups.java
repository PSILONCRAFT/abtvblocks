package com.psiloncraft.abtvblocks.item;

import com.psiloncraft.abtvblocks.abtvblocks;
import com.sun.source.tree.IdentifierTree;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


    public class ModItemGroups{
        public static final ItemGroup ABTV = FabricItemGroupBuilder.build(new Identifier(abtvblocks.MOD_ID, "abtv"),
                ()-> new ItemStack(ModItems.PSILONIUM_INGOT));
    }
