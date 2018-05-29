package com.repeatedstrings.mods.Bohr.Items;

import com.repeatedstrings.mods.Bohr.Handlers.BohrItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class BohrBlock extends Block {
    private int maxReturn = 4;

    public BohrBlock(Material mat, String unLname, String regName,CreativeTabs tab, float hard, float swings, int numGivn, String tool) {
        super(mat);
        setUnlocalizedName(unLname);
        setRegistryName(regName);
        setCreativeTab(tab);
        setHardness(hard);
        setResistance(swings);
        setHarvestLevel(tool, numGivn);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune){
        return BohrItemHandler.bohrOre;
    }
    @Override
    public int quantityDropped(Random random){
       return random.nextInt(maxReturn);
    }
}
