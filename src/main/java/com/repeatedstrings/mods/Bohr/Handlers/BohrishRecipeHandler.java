//package com.repeatedstrings.mods.Bohr.Handlers;
//
//import net.minecraft.init.Items;
//import net.minecraft.item.ItemStack;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//
///**
// * Created by james on 5/16/17.
// *
// * issues: another stringindexout of bounds, 8.. I added ammount:1, didn't fix
// * commented out to pickaxe, pickaxe works
// *
// * it was sword, i had "X " --> didn't have " X "
// * array count from 0, so 9 slots, it didn't have enough slots.
// */
//public class BohrishRecipeHandler {
//
//    public static void init() {
//        GameRegistry.addSmelting(BohrItemHandler.bohrOre, new ItemStack(BohrItemHandler.bohrite), 1);
//
//        GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrPickaxe,1),
//                "XXX",
//                " Y ",
//                " Y ",
//                'X', BohrItemHandler.bohrite,
//                'Y', Items.STICK);
//
//        GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrShovel,1),
//                " X ",
//                " Y ",
//                " Y ",
//                'X', BohrItemHandler.bohrite,
//                'Y', Items.STICK);
//
//        GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrHoe,1),
//                "XX ",
//                " Y ",
//                " Y ",
//                'X', BohrItemHandler.bohrite,
//                'Y', Items.STICK);
//
//        GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrAxe,1),
//                "XX ",
//                "XY ",
//                " Y ",
//                'X', BohrItemHandler.bohrite,
//                'Y', Items.STICK);
//
//        GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrSword,1),
//                " X ",
//                " X ",
//                " Y ",
//                'X', BohrItemHandler.bohrite,
//                'Y', Items.STICK);
//    }
//}
