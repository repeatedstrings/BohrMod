package com.repeatedstrings.mods.Bohr.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BohrOre extends Item {
    public BohrOre(String langName, String regName, int maxStack, CreativeTabs tabs) {
        this.setUnlocalizedName(langName);
        this.setRegistryName(regName);
        this.setMaxStackSize(maxStack);
        this.setCreativeTab(tabs);
    }
}
