package com.repeatedstrings.mods.Bohr.Handlers;

import com.repeatedstrings.mods.Bohr.Items.BohrBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/8/17.
 */
public class BohrBlockHandler implements BohrHandlerInterface {
    public static Block bohrBlock;
    public static ItemBlock iBohrBlock;

    public static void preinit() {
        bohrBlock = new BohrBlock(Material.ROCK, "loc_bohr_block","bohr_block", CreativeTabs.BUILDING_BLOCKS, 1F, 2F, 0, "pickaxe");
        ForgeRegistries.BLOCKS.register(bohrBlock);

        iBohrBlock = new ItemBlock(bohrBlock);
        iBohrBlock.setRegistryName("ibohr_block");
        ForgeRegistries.ITEMS.register(iBohrBlock);

        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("bohr:bohr_block", "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BohrBlockHandler.bohrBlock), DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);

    }

    public static void init() {
    }

    public static void postInit() {
    }

}
