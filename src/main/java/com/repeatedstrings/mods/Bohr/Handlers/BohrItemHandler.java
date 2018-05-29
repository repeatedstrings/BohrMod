package com.repeatedstrings.mods.Bohr.Handlers;

import com.repeatedstrings.mods.Bohr.Items.BohrOre;
import com.repeatedstrings.mods.Bohr.Items.BohrShovel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BohrItemHandler {
    public static BohrOre bohrOre;
    private static String langNameOre = "lang_bohr_ore";
    private static String regNameOre = "bohr_ore";

    public static void preInit() {
        bohrOre = new BohrOre(langNameOre, regNameOre, 64, CreativeTabs.MATERIALS);
//        code it first to pass in location ("bohr:"+regNameOre), then pull
        modelLoader(bohrOre);
    }

    public static void init() {
    }

    public static void postInit() {
    }

    private static void modelLoader(Item bohrItem) {
        final int DEFAULT_ITEM_SUBTYPE = 0;

        ForgeRegistries.ITEMS.register(bohrItem);

        //bug to not include bohr:regName
        ModelResourceLocation imrl = new ModelResourceLocation(bohrItem.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(bohrItem,
                DEFAULT_ITEM_SUBTYPE, imrl);
    }

}
