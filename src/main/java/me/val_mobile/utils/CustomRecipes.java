/*
    Copyright (C) 2021  Val_Mobile

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package me.val_mobile.utils;

import me.val_mobile.rlcraft.RLCraftPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import java.util.HashSet;

public class CustomRecipes {

    private final FileConfiguration config = CustomConfig.getRecipeConfig();

    private final RLCraftPlugin plugin;
    private final CustomItems customItems;

    private static HashSet<Recipe> ntrRecipes = new HashSet<>();
    private static HashSet<Recipe> baubleRecipes = new HashSet<>();
    private static HashSet<Recipe> dragonRecipes = new HashSet<>();
    private static HashSet<Recipe> seaSerpentRecipes = new HashSet<>();
    private static HashSet<Recipe> spartanWeaponryRecipes = new HashSet<>();
    private static HashSet<Recipe> waystoneRecipes = new HashSet<>();

    public static HashSet<Recipe> getNtrRecipes() {
        return ntrRecipes;
    }
    public static HashSet<Recipe> getBaubleRecipes() {
        return baubleRecipes;
    }
    public static HashSet<Recipe> getDragonRecipes() {
        return dragonRecipes;
    }
    public static HashSet<Recipe> getSeaSerpentRecipes() {
        return seaSerpentRecipes;
    }
    public static HashSet<Recipe> getSpartanWeaponryRecipes() {
        return spartanWeaponryRecipes;
    }
    public static HashSet<Recipe> getWaystoneRecipes() {
        return spartanWeaponryRecipes;
    }

    private final ShapedRecipeBuilder flintAxe;
    private final ShapedRecipeBuilder flintKnife;
    private final ShapedRecipeBuilder flintPickaxe;
    private final ShapedRecipeBuilder flintShovel;
    private final ShapedRecipeBuilder flintHoe;
    private final ShapedRecipeBuilder cobblestone;
    private final ShapedRecipeBuilder plantString;
    private final ShapelessRecipeBuilder fireDragonsteelIngot0;
    private final ShapelessRecipeBuilder iceDragonsteelIngot0;
    private final ShapelessRecipeBuilder lightningDragonsteelIngot0;
    private final ShapedRecipeBuilder blueDragonscaleHelmet;
    private final ShapedRecipeBuilder blueDragonscaleChestplate;
    private final ShapedRecipeBuilder blueDragonscaleLeggings;
    private final ShapedRecipeBuilder blueDragonscaleBoots;
    private final ShapedRecipeBuilder bronzeDragonscaleHelmet;
    private final ShapedRecipeBuilder bronzeDragonscaleChestplate;
    private final ShapedRecipeBuilder bronzeDragonscaleLeggings;
    private final ShapedRecipeBuilder bronzeDragonscaleBoots;
    private final ShapedRecipeBuilder grayDragonscaleHelmet;
    private final ShapedRecipeBuilder grayDragonscaleChestplate;
    private final ShapedRecipeBuilder grayDragonscaleLeggings;
    private final ShapedRecipeBuilder grayDragonscaleBoots;
    private final ShapedRecipeBuilder greenDragonscaleHelmet;
    private final ShapedRecipeBuilder greenDragonscaleChestplate;
    private final ShapedRecipeBuilder greenDragonscaleLeggings;
    private final ShapedRecipeBuilder greenDragonscaleBoots;
    private final ShapedRecipeBuilder redDragonscaleHelmet;
    private final ShapedRecipeBuilder redDragonscaleChestplate;
    private final ShapedRecipeBuilder redDragonscaleLeggings;
    private final ShapedRecipeBuilder redDragonscaleBoots;
    private final ShapedRecipeBuilder sapphireDragonscaleHelmet;
    private final ShapedRecipeBuilder sapphireDragonscaleChestplate;
    private final ShapedRecipeBuilder sapphireDragonscaleLeggings;
    private final ShapedRecipeBuilder sapphireDragonscaleBoots;
    private final ShapedRecipeBuilder silverDragonscaleHelmet;
    private final ShapedRecipeBuilder silverDragonscaleChestplate;
    private final ShapedRecipeBuilder silverDragonscaleLeggings;
    private final ShapedRecipeBuilder silverDragonscaleBoots;
    private final ShapedRecipeBuilder whiteDragonscaleHelmet;
    private final ShapedRecipeBuilder whiteDragonscaleChestplate;
    private final ShapedRecipeBuilder whiteDragonscaleLeggings;
    private final ShapedRecipeBuilder whiteDragonscaleBoots;
    private final ShapedRecipeBuilder amethystDragonscaleHelmet;
    private final ShapedRecipeBuilder amethystDragonscaleChestplate;
    private final ShapedRecipeBuilder amethystDragonscaleLeggings;
    private final ShapedRecipeBuilder amethystDragonscaleBoots;
    private final ShapedRecipeBuilder blackDragonscaleHelmet;
    private final ShapedRecipeBuilder blackDragonscaleChestplate;
    private final ShapedRecipeBuilder blackDragonscaleLeggings;
    private final ShapedRecipeBuilder blackDragonscaleBoots;
    private final ShapedRecipeBuilder copperDragonscaleHelmet;
    private final ShapedRecipeBuilder copperDragonscaleChestplate;
    private final ShapedRecipeBuilder copperDragonscaleLeggings;
    private final ShapedRecipeBuilder copperDragonscaleBoots;
    private final ShapedRecipeBuilder electricDragonscaleHelmet;
    private final ShapedRecipeBuilder electricDragonscaleChestplate;
    private final ShapedRecipeBuilder electricDragonscaleLeggings;
    private final ShapedRecipeBuilder electricDragonscaleBoots;
    private final ShapedRecipeBuilder blueTideGuardianHelmet;
    private final ShapedRecipeBuilder blueTideGuardianChestplate;
    private final ShapedRecipeBuilder blueTideGuardianLeggings;
    private final ShapedRecipeBuilder blueTideGuardianBoots;
    private final ShapedRecipeBuilder bronzeTideGuardianHelmet;
    private final ShapedRecipeBuilder bronzeTideGuardianChestplate;
    private final ShapedRecipeBuilder bronzeTideGuardianLeggings;
    private final ShapedRecipeBuilder bronzeTideGuardianBoots;
    private final ShapedRecipeBuilder deepblueTideGuardianHelmet;
    private final ShapedRecipeBuilder deepblueTideGuardianChestplate;
    private final ShapedRecipeBuilder deepblueTideGuardianLeggings;
    private final ShapedRecipeBuilder deepblueTideGuardianBoots;
    private final ShapedRecipeBuilder greenTideGuardianHelmet;
    private final ShapedRecipeBuilder greenTideGuardianChestplate;
    private final ShapedRecipeBuilder greenTideGuardianLeggings;
    private final ShapedRecipeBuilder greenTideGuardianBoots;
    private final ShapedRecipeBuilder purpleTideGuardianHelmet;
    private final ShapedRecipeBuilder purpleTideGuardianChestplate;
    private final ShapedRecipeBuilder purpleTideGuardianLeggings;
    private final ShapedRecipeBuilder purpleTideGuardianBoots;
    private final ShapedRecipeBuilder redTideGuardianHelmet;
    private final ShapedRecipeBuilder redTideGuardianChestplate;
    private final ShapedRecipeBuilder redTideGuardianLeggings;
    private final ShapedRecipeBuilder redTideGuardianBoots;
    private final ShapedRecipeBuilder tealTideGuardianHelmet;
    private final ShapedRecipeBuilder tealTideGuardianChestplate;
    private final ShapedRecipeBuilder tealTideGuardianLeggings;
    private final ShapedRecipeBuilder tealTideGuardianBoots;
    private final ShapedRecipeBuilder dragonbonePickaxe;
    private final ShapedRecipeBuilder dragonboneAxe;
    private final ShapedRecipeBuilder dragonboneShovel;
    private final ShapedRecipeBuilder dragonboneHoe;
    private final ShapedRecipeBuilder dragonboneSword;
    private final ShapedRecipeBuilder dragonboneBow;
    private final ShapelessRecipeBuilder flamedDragonboneSword;
    private final ShapelessRecipeBuilder icedDragonboneSword;
    private final ShapelessRecipeBuilder lightningDragonboneSword;
    private final ShapedRecipeBuilder fireDragonsteelSword;
    private final ShapedRecipeBuilder fireDragonsteelPickaxe;
    private final ShapedRecipeBuilder fireDragonsteelAxe;
    private final ShapedRecipeBuilder fireDragonsteelShovel;
    private final ShapedRecipeBuilder fireDragonsteelHoe;
    private final ShapedRecipeBuilder fireDragonsteelHelmet;
    private final ShapedRecipeBuilder fireDragonsteelChestplate;
    private final ShapedRecipeBuilder fireDragonsteelLeggings;
    private final ShapedRecipeBuilder fireDragonsteelBoots;
    private final ShapedRecipeBuilder iceDragonsteelSword;
    private final ShapedRecipeBuilder iceDragonsteelPickaxe;
    private final ShapedRecipeBuilder iceDragonsteelAxe;
    private final ShapedRecipeBuilder iceDragonsteelShovel;
    private final ShapedRecipeBuilder iceDragonsteelHoe;
    private final ShapedRecipeBuilder iceDragonsteelHelmet;
    private final ShapedRecipeBuilder iceDragonsteelChestplate;
    private final ShapedRecipeBuilder iceDragonsteelLeggings;
    private final ShapedRecipeBuilder iceDragonsteelBoots;
    private final ShapedRecipeBuilder lightningDragonsteelSword;
    private final ShapedRecipeBuilder lightningDragonsteelPickaxe;
    private final ShapedRecipeBuilder lightningDragonsteelAxe;
    private final ShapedRecipeBuilder lightningDragonsteelShovel;
    private final ShapedRecipeBuilder lightningDragonsteelHoe;
    private final ShapedRecipeBuilder lightningDragonsteelHelmet;
    private final ShapedRecipeBuilder lightningDragonsteelChestplate;
    private final ShapedRecipeBuilder lightningDragonsteelLeggings;
    private final ShapedRecipeBuilder lightningDragonsteelBoots;
    private final ShapedRecipeBuilder dragonboneRapier;
    private final ShapedRecipeBuilder dragonboneKatana;
    private final ShapedRecipeBuilder dragonboneGreatsword;
    private final ShapedRecipeBuilder dragonboneLongsword;
    private final ShapedRecipeBuilder dragonboneSpear;
    private final ShapedRecipeBuilder dragonboneSaber;
    private final ShapedRecipeBuilder dragonboneBoomerang;
    private final ShapedRecipeBuilder dragonboneDagger;
    private final ShapedRecipeBuilder dragonboneGlaive;
    private final ShapedRecipeBuilder dragonboneHalberd;
    private final ShapedRecipeBuilder dragonboneHammer;
    private final ShapedRecipeBuilder dragonboneJavelin;
    private final ShapedRecipeBuilder dragonboneLance;
    private final ShapedRecipeBuilder dragonboneMace;
    private final ShapedRecipeBuilder dragonbonePike;
    private final ShapedRecipeBuilder dragonboneQuarterstaff;
    private final ShapedRecipeBuilder dragonboneTomahawk;
    private final ShapedRecipeBuilder dragonboneThrowingKnife;
    private final ShapedRecipeBuilder dragonboneWarhammer;
    private final ShapedRecipeBuilder dragonboneBattleaxe;
    private final ShapedRecipeBuilder dragonboneLongbow;
    private final ShapedRecipeBuilder dragonboneCrossbow;
    private final ShapedRecipeBuilder flamedDragonboneRapier;
    private final ShapedRecipeBuilder flamedDragonboneKatana;
    private final ShapedRecipeBuilder flamedDragonboneGreatsword;
    private final ShapedRecipeBuilder flamedDragonboneLongsword;
    private final ShapedRecipeBuilder flamedDragonboneSpear;
    private final ShapedRecipeBuilder flamedDragonboneSaber;
    private final ShapedRecipeBuilder flamedDragonboneBoomerang;
    private final ShapedRecipeBuilder flamedDragonboneDagger;
    private final ShapedRecipeBuilder flamedDragonboneGlaive;
    private final ShapedRecipeBuilder flamedDragonboneHalberd;
    private final ShapedRecipeBuilder flamedDragonboneHammer;
    private final ShapedRecipeBuilder flamedDragonboneJavelin;
    private final ShapedRecipeBuilder flamedDragonboneLance;
    private final ShapedRecipeBuilder flamedDragonboneMace;
    private final ShapedRecipeBuilder flamedDragonbonePike;
    private final ShapedRecipeBuilder flamedDragonboneQuarterstaff;
    private final ShapedRecipeBuilder flamedDragonboneTomahawk;
    private final ShapedRecipeBuilder flamedDragonboneThrowingKnife;
    private final ShapedRecipeBuilder flamedDragonboneWarhammer;
    private final ShapedRecipeBuilder flamedDragonboneBattleaxe;
    private final ShapedRecipeBuilder flamedDragonboneLongbow;
    private final ShapedRecipeBuilder flamedDragonboneCrossbow;
    private final ShapedRecipeBuilder icedDragonboneRapier;
    private final ShapedRecipeBuilder icedDragonboneKatana;
    private final ShapedRecipeBuilder icedDragonboneGreatsword;
    private final ShapedRecipeBuilder icedDragonboneLongsword;
    private final ShapedRecipeBuilder icedDragonboneSpear;
    private final ShapedRecipeBuilder icedDragonboneSaber;
    private final ShapedRecipeBuilder icedDragonboneBoomerang;
    private final ShapedRecipeBuilder icedDragonboneDagger;
    private final ShapedRecipeBuilder icedDragonboneGlaive;
    private final ShapedRecipeBuilder icedDragonboneHalberd;
    private final ShapedRecipeBuilder icedDragonboneHammer;
    private final ShapedRecipeBuilder icedDragonboneJavelin;
    private final ShapedRecipeBuilder icedDragonboneLance;
    private final ShapedRecipeBuilder icedDragonboneMace;
    private final ShapedRecipeBuilder icedDragonbonePike;
    private final ShapedRecipeBuilder icedDragonboneQuarterstaff;
    private final ShapedRecipeBuilder icedDragonboneTomahawk;
    private final ShapedRecipeBuilder icedDragonboneThrowingKnife;
    private final ShapedRecipeBuilder icedDragonboneWarhammer;
    private final ShapedRecipeBuilder icedDragonboneBattleaxe;
    private final ShapedRecipeBuilder icedDragonboneLongbow;
    private final ShapedRecipeBuilder icedDragonboneCrossbow;
    private final ShapedRecipeBuilder lightningDragonboneRapier;
    private final ShapedRecipeBuilder lightningDragonboneKatana;
    private final ShapedRecipeBuilder lightningDragonboneGreatsword;
    private final ShapedRecipeBuilder lightningDragonboneLongsword;
    private final ShapedRecipeBuilder lightningDragonboneSpear;
    private final ShapedRecipeBuilder lightningDragonboneSaber;
    private final ShapedRecipeBuilder lightningDragonboneBoomerang;
    private final ShapedRecipeBuilder lightningDragonboneDagger;
    private final ShapedRecipeBuilder lightningDragonboneGlaive;
    private final ShapedRecipeBuilder lightningDragonboneHalberd;
    private final ShapedRecipeBuilder lightningDragonboneHammer;
    private final ShapedRecipeBuilder lightningDragonboneJavelin;
    private final ShapedRecipeBuilder lightningDragonboneLance;
    private final ShapedRecipeBuilder lightningDragonboneMace;
    private final ShapedRecipeBuilder lightningDragonbonePike;
    private final ShapedRecipeBuilder lightningDragonboneQuarterstaff;
    private final ShapedRecipeBuilder lightningDragonboneTomahawk;
    private final ShapedRecipeBuilder lightningDragonboneThrowingKnife;
    private final ShapedRecipeBuilder lightningDragonboneWarhammer;
    private final ShapedRecipeBuilder lightningDragonboneBattleaxe;
    private final ShapedRecipeBuilder lightningDragonboneLongbow;
    private final ShapedRecipeBuilder lightningDragonboneCrossbow;
    private final ShapedRecipeBuilder fireDragonsteelRapier;
    private final ShapedRecipeBuilder fireDragonsteelKatana;
    private final ShapedRecipeBuilder fireDragonsteelGreatsword;
    private final ShapedRecipeBuilder fireDragonsteelLongsword;
    private final ShapedRecipeBuilder fireDragonsteelSpear;
    private final ShapedRecipeBuilder fireDragonsteelSaber;
    private final ShapedRecipeBuilder fireDragonsteelBoomerang;
    private final ShapedRecipeBuilder fireDragonsteelDagger;
    private final ShapedRecipeBuilder fireDragonsteelGlaive;
    private final ShapedRecipeBuilder fireDragonsteelHalberd;
    private final ShapedRecipeBuilder fireDragonsteelHammer;
    private final ShapedRecipeBuilder fireDragonsteelJavelin;
    private final ShapedRecipeBuilder fireDragonsteelLance;
    private final ShapedRecipeBuilder fireDragonsteelMace;
    private final ShapedRecipeBuilder fireDragonsteelPike;
    private final ShapedRecipeBuilder fireDragonsteelQuarterstaff;
    private final ShapedRecipeBuilder fireDragonsteelTomahawk;
    private final ShapedRecipeBuilder fireDragonsteelThrowingKnife;
    private final ShapedRecipeBuilder fireDragonsteelWarhammer;
    private final ShapedRecipeBuilder fireDragonsteelBattleaxe;
    private final ShapedRecipeBuilder fireDragonsteelLongbow;
    private final ShapedRecipeBuilder fireDragonsteelCrossbow;
    private final ShapedRecipeBuilder iceDragonsteelRapier;
    private final ShapedRecipeBuilder iceDragonsteelKatana;
    private final ShapedRecipeBuilder iceDragonsteelGreatsword;
    private final ShapedRecipeBuilder iceDragonsteelLongsword;
    private final ShapedRecipeBuilder iceDragonsteelSpear;
    private final ShapedRecipeBuilder iceDragonsteelSaber;
    private final ShapedRecipeBuilder iceDragonsteelBoomerang;
    private final ShapedRecipeBuilder iceDragonsteelDagger;
    private final ShapedRecipeBuilder iceDragonsteelGlaive;
    private final ShapedRecipeBuilder iceDragonsteelHalberd;
    private final ShapedRecipeBuilder iceDragonsteelHammer;
    private final ShapedRecipeBuilder iceDragonsteelJavelin;
    private final ShapedRecipeBuilder iceDragonsteelLance;
    private final ShapedRecipeBuilder iceDragonsteelMace;
    private final ShapedRecipeBuilder iceDragonsteelPike;
    private final ShapedRecipeBuilder iceDragonsteelQuarterstaff;
    private final ShapedRecipeBuilder iceDragonsteelTomahawk;
    private final ShapedRecipeBuilder iceDragonsteelThrowingKnife;
    private final ShapedRecipeBuilder iceDragonsteelWarhammer;
    private final ShapedRecipeBuilder iceDragonsteelBattleaxe;
    private final ShapedRecipeBuilder iceDragonsteelLongbow;
    private final ShapedRecipeBuilder iceDragonsteelCrossbow;
    private final ShapedRecipeBuilder lightningDragonsteelRapier;
    private final ShapedRecipeBuilder lightningDragonsteelKatana;
    private final ShapedRecipeBuilder lightningDragonsteelGreatsword;
    private final ShapedRecipeBuilder lightningDragonsteelLongsword;
    private final ShapedRecipeBuilder lightningDragonsteelSpear;
    private final ShapedRecipeBuilder lightningDragonsteelSaber;
    private final ShapedRecipeBuilder lightningDragonsteelBoomerang;
    private final ShapedRecipeBuilder lightningDragonsteelDagger;
    private final ShapedRecipeBuilder lightningDragonsteelGlaive;
    private final ShapedRecipeBuilder lightningDragonsteelHalberd;
    private final ShapedRecipeBuilder lightningDragonsteelHammer;
    private final ShapedRecipeBuilder lightningDragonsteelJavelin;
    private final ShapedRecipeBuilder lightningDragonsteelLance;
    private final ShapedRecipeBuilder lightningDragonsteelMace;
    private final ShapedRecipeBuilder lightningDragonsteelPike;
    private final ShapedRecipeBuilder lightningDragonsteelQuarterstaff;
    private final ShapedRecipeBuilder lightningDragonsteelTomahawk;
    private final ShapedRecipeBuilder lightningDragonsteelThrowingKnife;
    private final ShapedRecipeBuilder lightningDragonsteelWarhammer;
    private final ShapedRecipeBuilder lightningDragonsteelBattleaxe;
    private final ShapedRecipeBuilder lightningDragonsteelLongbow;
    private final ShapedRecipeBuilder lightningDragonsteelCrossbow;
    private final SmithingRecipeBuilder netheriteRapier;
    private final SmithingRecipeBuilder netheriteKatana;
    private final SmithingRecipeBuilder netheriteGreatsword;
    private final SmithingRecipeBuilder netheriteLongsword;
    private final SmithingRecipeBuilder netheriteSpear;
    private final SmithingRecipeBuilder netheriteSaber;
    private final SmithingRecipeBuilder netheriteBoomerang;
    private final SmithingRecipeBuilder netheriteDagger;
    private final SmithingRecipeBuilder netheriteGlaive;
    private final SmithingRecipeBuilder netheriteHalberd;
    private final SmithingRecipeBuilder netheriteHammer;
    private final SmithingRecipeBuilder netheriteJavelin;
    private final SmithingRecipeBuilder netheriteLance;
    private final SmithingRecipeBuilder netheriteMace;
    private final SmithingRecipeBuilder netheritePike;
    private final SmithingRecipeBuilder netheriteQuarterstaff;
    private final SmithingRecipeBuilder netheriteTomahawk;
    private final SmithingRecipeBuilder netheriteThrowingKnife;
    private final SmithingRecipeBuilder netheriteWarhammer;
    private final SmithingRecipeBuilder netheriteBattleaxe;
    private final SmithingRecipeBuilder netheriteLongbow;
    private final SmithingRecipeBuilder netheriteCrossbow;
    private final ShapedRecipeBuilder diamondRapier;
    private final ShapedRecipeBuilder diamondKatana;
    private final ShapedRecipeBuilder diamondGreatsword;
    private final ShapedRecipeBuilder diamondLongsword;
    private final ShapedRecipeBuilder diamondSpear;
    private final ShapedRecipeBuilder diamondSaber;
    private final ShapedRecipeBuilder diamondBoomerang;
    private final ShapedRecipeBuilder diamondDagger;
    private final ShapedRecipeBuilder diamondGlaive;
    private final ShapedRecipeBuilder diamondHalberd;
    private final ShapedRecipeBuilder diamondHammer;
    private final ShapedRecipeBuilder diamondJavelin;
    private final ShapedRecipeBuilder diamondLance;
    private final ShapedRecipeBuilder diamondMace;
    private final ShapedRecipeBuilder diamondPike;
    private final ShapedRecipeBuilder diamondQuarterstaff;
    private final ShapedRecipeBuilder diamondTomahawk;
    private final ShapedRecipeBuilder diamondThrowingKnife;
    private final ShapedRecipeBuilder diamondWarhammer;
    private final ShapedRecipeBuilder diamondBattleaxe;
    private final ShapedRecipeBuilder diamondLongbow;
    private final ShapedRecipeBuilder diamondCrossbow;
    private final ShapedRecipeBuilder ironRapier;
    private final ShapedRecipeBuilder ironKatana;
    private final ShapedRecipeBuilder ironGreatsword;
    private final ShapedRecipeBuilder ironLongsword;
    private final ShapedRecipeBuilder ironSpear;
    private final ShapedRecipeBuilder ironSaber;
    private final ShapedRecipeBuilder ironBoomerang;
    private final ShapedRecipeBuilder ironDagger;
    private final ShapedRecipeBuilder ironGlaive;
    private final ShapedRecipeBuilder ironHalberd;
    private final ShapedRecipeBuilder ironHammer;
    private final ShapedRecipeBuilder ironJavelin;
    private final ShapedRecipeBuilder ironLance;
    private final ShapedRecipeBuilder ironMace;
    private final ShapedRecipeBuilder ironPike;
    private final ShapedRecipeBuilder ironQuarterstaff;
    private final ShapedRecipeBuilder ironTomahawk;
    private final ShapedRecipeBuilder ironThrowingKnife;
    private final ShapedRecipeBuilder ironWarhammer;
    private final ShapedRecipeBuilder ironBattleaxe;
    private final ShapedRecipeBuilder ironLongbow;
    private final ShapedRecipeBuilder ironCrossbow;
    private final ShapedRecipeBuilder goldRapier;
    private final ShapedRecipeBuilder goldKatana;
    private final ShapedRecipeBuilder goldGreatsword;
    private final ShapedRecipeBuilder goldLongsword;
    private final ShapedRecipeBuilder goldSpear;
    private final ShapedRecipeBuilder goldSaber;
    private final ShapedRecipeBuilder goldBoomerang;
    private final ShapedRecipeBuilder goldDagger;
    private final ShapedRecipeBuilder goldGlaive;
    private final ShapedRecipeBuilder goldHalberd;
    private final ShapedRecipeBuilder goldHammer;
    private final ShapedRecipeBuilder goldJavelin;
    private final ShapedRecipeBuilder goldLance;
    private final ShapedRecipeBuilder goldMace;
    private final ShapedRecipeBuilder goldPike;
    private final ShapedRecipeBuilder goldQuarterstaff;
    private final ShapedRecipeBuilder goldTomahawk;
    private final ShapedRecipeBuilder goldThrowingKnife;
    private final ShapedRecipeBuilder goldWarhammer;
    private final ShapedRecipeBuilder goldBattleaxe;
    private final ShapedRecipeBuilder goldLongbow;
    private final ShapedRecipeBuilder goldCrossbow;
    private final ShapedRecipeBuilder stoneRapier;
    private final ShapedRecipeBuilder stoneKatana;
    private final ShapedRecipeBuilder stoneGreatsword;
    private final ShapedRecipeBuilder stoneLongsword;
    private final ShapedRecipeBuilder stoneSpear;
    private final ShapedRecipeBuilder stoneSaber;
    private final ShapedRecipeBuilder stoneBoomerang;
    private final ShapedRecipeBuilder stoneDagger;
    private final ShapedRecipeBuilder stoneGlaive;
    private final ShapedRecipeBuilder stoneHalberd;
    private final ShapedRecipeBuilder stoneHammer;
    private final ShapedRecipeBuilder stoneJavelin;
    private final ShapedRecipeBuilder stoneLance;
    private final ShapedRecipeBuilder stoneMace;
    private final ShapedRecipeBuilder stonePike;
    private final ShapedRecipeBuilder stoneQuarterstaff;
    private final ShapedRecipeBuilder stoneTomahawk;
    private final ShapedRecipeBuilder stoneThrowingKnife;
    private final ShapedRecipeBuilder stoneWarhammer;
    private final ShapedRecipeBuilder stoneBattleaxe;
    private final ShapedRecipeBuilder leatherLongbow;
    private final ShapedRecipeBuilder leatherCrossbow;
    private final ShapedRecipeBuilder woodenRapier;
    private final ShapedRecipeBuilder woodenKatana;
    private final ShapedRecipeBuilder woodenGreatsword;
    private final ShapedRecipeBuilder woodenLongsword;
    private final ShapedRecipeBuilder woodenSpear;
    private final ShapedRecipeBuilder woodenSaber;
    private final ShapedRecipeBuilder woodenBoomerang;
    private final ShapedRecipeBuilder woodenDagger;
    private final ShapedRecipeBuilder woodenGlaive;
    private final ShapedRecipeBuilder woodenHalberd;
    private final ShapedRecipeBuilder woodenHammer;
    private final ShapedRecipeBuilder woodenJavelin;
    private final ShapedRecipeBuilder woodenLance;
    private final ShapedRecipeBuilder woodenMace;
    private final ShapedRecipeBuilder woodenPike;
    private final ShapedRecipeBuilder woodenQuarterstaff;
    private final ShapedRecipeBuilder woodenTomahawk;
    private final ShapedRecipeBuilder woodenThrowingKnife;
    private final ShapedRecipeBuilder woodenWarhammer;
    private final ShapedRecipeBuilder woodenBattleaxe;
    private final ShapedRecipeBuilder woodenLongbow;
    private final ShapedRecipeBuilder woodenCrossbow;
    private final ShapedRecipeBuilder copperRapier;
    private final ShapedRecipeBuilder copperKatana;
    private final ShapedRecipeBuilder copperGreatsword;
    private final ShapedRecipeBuilder copperLongsword;
    private final ShapedRecipeBuilder copperSpear;
    private final ShapedRecipeBuilder copperSaber;
    private final ShapedRecipeBuilder copperBoomerang;
    private final ShapedRecipeBuilder copperDagger;
    private final ShapedRecipeBuilder copperGlaive;
    private final ShapedRecipeBuilder copperHalberd;
    private final ShapedRecipeBuilder copperHammer;
    private final ShapedRecipeBuilder copperJavelin;
    private final ShapedRecipeBuilder copperLance;
    private final ShapedRecipeBuilder copperMace;
    private final ShapedRecipeBuilder copperPike;
    private final ShapedRecipeBuilder copperQuarterstaff;
    private final ShapedRecipeBuilder copperTomahawk;
    private final ShapedRecipeBuilder copperThrowingKnife;
    private final ShapedRecipeBuilder copperWarhammer;
    private final ShapedRecipeBuilder copperBattleaxe;
    private final ShapedRecipeBuilder copperLongbow;
    private final ShapedRecipeBuilder copperCrossbow;
    private final ShapelessRecipeBuilder handle0;
    private final ShapedRecipeBuilder handle1;
    private final ShapedRecipeBuilder handle2;
    private final ShapedRecipeBuilder pole0;
    private final ShapedRecipeBuilder pole1;
    private final ShapedRecipeBuilder pole2;
    private final ShapelessRecipeBuilder witherboneHandle;
    private final ShapelessRecipeBuilder witherbonePole;
    private final ShapedRecipeBuilder balloon;
    private final ShapedRecipeBuilder cobaltShield;
    private final ShapedRecipeBuilder obsidianSkull;
    private final ShapedRecipeBuilder sunglasses;
    private final ShapedRecipeBuilder crackedBlackDragonscale;
    private final ShapedRecipeBuilder blackDragonscale;
    private final ShapedRecipeBuilder ankhCharm;
    private final ShapedRecipeBuilder warpedScroll;
    private final ShapedRecipeBuilder fireDragonsteelBlock;
    private final ShapedRecipeBuilder iceDragonsteelBlock;
    private final ShapedRecipeBuilder lightningDragonsteelBlock;
    private final ShapelessRecipeBuilder fireDragonsteelIngot1;
    private final ShapelessRecipeBuilder iceDragonsteelIngot1;
    private final ShapelessRecipeBuilder lightningDragonsteelIngot1;
    private final ShapedRecipeBuilder woodenClub;
    private final ShapelessRecipeBuilder studdedClub;

    public CustomRecipes(RLCraftPlugin instance) {
        plugin = instance;
        customItems = new CustomItems(instance);
        
        flintAxe = new ShapedRecipeBuilder(config, 0, instance);
        flintKnife = new ShapedRecipeBuilder(config, 1, instance);
        flintPickaxe = new ShapedRecipeBuilder(config, 2, instance);
        flintShovel = new ShapedRecipeBuilder(config, 3, instance);
        flintHoe = new ShapedRecipeBuilder(config, 4, instance);
        cobblestone = new ShapedRecipeBuilder(config, 5, plugin, true);
        plantString = new ShapedRecipeBuilder(config, 6, instance);
        fireDragonsteelIngot0 = new ShapelessRecipeBuilder(config, 7, instance);
        iceDragonsteelIngot0 = new ShapelessRecipeBuilder(config, 8, instance);
        lightningDragonsteelIngot0 = new ShapelessRecipeBuilder(config, 9, instance);
        blueDragonscaleHelmet = new ShapedRecipeBuilder(config, 10, instance);
        blueDragonscaleChestplate = new ShapedRecipeBuilder(config, 11, instance);
        blueDragonscaleLeggings = new ShapedRecipeBuilder(config, 12, instance);
        blueDragonscaleBoots = new ShapedRecipeBuilder(config, 13, instance);
        bronzeDragonscaleHelmet = new ShapedRecipeBuilder(config, 14, instance);
        bronzeDragonscaleChestplate = new ShapedRecipeBuilder(config, 15, instance);
        bronzeDragonscaleLeggings = new ShapedRecipeBuilder(config, 16, instance);
        bronzeDragonscaleBoots = new ShapedRecipeBuilder(config, 17, instance);
        grayDragonscaleHelmet = new ShapedRecipeBuilder(config, 18, instance);
        grayDragonscaleChestplate = new ShapedRecipeBuilder(config, 19, instance);
        grayDragonscaleLeggings = new ShapedRecipeBuilder(config, 20, instance);
        grayDragonscaleBoots = new ShapedRecipeBuilder(config, 21, instance);
        greenDragonscaleHelmet = new ShapedRecipeBuilder(config, 22, instance);
        greenDragonscaleChestplate = new ShapedRecipeBuilder(config, 23, instance);
        greenDragonscaleLeggings = new ShapedRecipeBuilder(config, 24, instance);
        greenDragonscaleBoots = new ShapedRecipeBuilder(config, 25, instance);
        redDragonscaleHelmet = new ShapedRecipeBuilder(config, 26, instance);
        redDragonscaleChestplate = new ShapedRecipeBuilder(config, 27, instance);
        redDragonscaleLeggings = new ShapedRecipeBuilder(config, 28, instance);
        redDragonscaleBoots = new ShapedRecipeBuilder(config, 29, instance);
        sapphireDragonscaleHelmet = new ShapedRecipeBuilder(config, 30, instance);
        sapphireDragonscaleChestplate = new ShapedRecipeBuilder(config, 31, instance);
        sapphireDragonscaleLeggings = new ShapedRecipeBuilder(config, 32, instance);
        sapphireDragonscaleBoots = new ShapedRecipeBuilder(config, 33, instance);
        silverDragonscaleHelmet = new ShapedRecipeBuilder(config, 34, instance);
        silverDragonscaleChestplate = new ShapedRecipeBuilder(config, 35, instance);
        silverDragonscaleLeggings = new ShapedRecipeBuilder(config, 36, instance);
        silverDragonscaleBoots = new ShapedRecipeBuilder(config, 37, instance);
        whiteDragonscaleHelmet = new ShapedRecipeBuilder(config, 38, instance);
        whiteDragonscaleChestplate = new ShapedRecipeBuilder(config, 39, instance);
        whiteDragonscaleLeggings = new ShapedRecipeBuilder(config, 40, instance);
        whiteDragonscaleBoots = new ShapedRecipeBuilder(config, 41, instance);
        amethystDragonscaleHelmet = new ShapedRecipeBuilder(config, 42, instance);
        amethystDragonscaleChestplate = new ShapedRecipeBuilder(config, 43, instance);
        amethystDragonscaleLeggings = new ShapedRecipeBuilder(config, 44, instance);
        amethystDragonscaleBoots = new ShapedRecipeBuilder(config, 45, instance);
        blackDragonscaleHelmet = new ShapedRecipeBuilder(config, 46, instance);
        blackDragonscaleChestplate = new ShapedRecipeBuilder(config, 47, instance);
        blackDragonscaleLeggings = new ShapedRecipeBuilder(config, 48, instance);
        blackDragonscaleBoots = new ShapedRecipeBuilder(config, 49, instance);
        copperDragonscaleHelmet = new ShapedRecipeBuilder(config, 50, instance);
        copperDragonscaleChestplate = new ShapedRecipeBuilder(config, 51, instance);
        copperDragonscaleLeggings = new ShapedRecipeBuilder(config, 52, instance);
        copperDragonscaleBoots = new ShapedRecipeBuilder(config, 53, instance);
        electricDragonscaleHelmet = new ShapedRecipeBuilder(config, 54, instance);
        electricDragonscaleChestplate = new ShapedRecipeBuilder(config, 55, instance);
        electricDragonscaleLeggings = new ShapedRecipeBuilder(config, 56, instance);
        electricDragonscaleBoots = new ShapedRecipeBuilder(config, 57, instance);
        blueTideGuardianHelmet = new ShapedRecipeBuilder(config, 58, instance);
        blueTideGuardianChestplate = new ShapedRecipeBuilder(config, 59, instance);
        blueTideGuardianLeggings = new ShapedRecipeBuilder(config, 60, instance);
        blueTideGuardianBoots = new ShapedRecipeBuilder(config, 61, instance);
        bronzeTideGuardianHelmet = new ShapedRecipeBuilder(config, 62, instance);
        bronzeTideGuardianChestplate = new ShapedRecipeBuilder(config, 63, instance);
        bronzeTideGuardianLeggings = new ShapedRecipeBuilder(config, 64, instance);
        bronzeTideGuardianBoots = new ShapedRecipeBuilder(config, 65, instance);
        deepblueTideGuardianHelmet = new ShapedRecipeBuilder(config, 66, instance);
        deepblueTideGuardianChestplate = new ShapedRecipeBuilder(config, 67, instance);
        deepblueTideGuardianLeggings = new ShapedRecipeBuilder(config, 68, instance);
        deepblueTideGuardianBoots = new ShapedRecipeBuilder(config, 69, instance);
        greenTideGuardianHelmet = new ShapedRecipeBuilder(config, 70, instance);
        greenTideGuardianChestplate = new ShapedRecipeBuilder(config, 71, instance);
        greenTideGuardianLeggings = new ShapedRecipeBuilder(config, 72, instance);
        greenTideGuardianBoots = new ShapedRecipeBuilder(config, 73, instance);
        purpleTideGuardianHelmet = new ShapedRecipeBuilder(config, 74, instance);
        purpleTideGuardianChestplate = new ShapedRecipeBuilder(config, 75, instance);
        purpleTideGuardianLeggings = new ShapedRecipeBuilder(config, 76, instance);
        purpleTideGuardianBoots = new ShapedRecipeBuilder(config, 77, instance);
        redTideGuardianHelmet = new ShapedRecipeBuilder(config, 78, instance);
        redTideGuardianChestplate = new ShapedRecipeBuilder(config, 79, instance);
        redTideGuardianLeggings = new ShapedRecipeBuilder(config, 80, instance);
        redTideGuardianBoots = new ShapedRecipeBuilder(config, 81, instance);
        tealTideGuardianHelmet = new ShapedRecipeBuilder(config, 82, instance);
        tealTideGuardianChestplate = new ShapedRecipeBuilder(config, 83, instance);
        tealTideGuardianLeggings = new ShapedRecipeBuilder(config, 84, instance);
        tealTideGuardianBoots = new ShapedRecipeBuilder(config, 85, instance);
        dragonbonePickaxe = new ShapedRecipeBuilder(config, 86, instance);
        dragonboneAxe = new ShapedRecipeBuilder(config, 87, instance);
        dragonboneShovel = new ShapedRecipeBuilder(config, 88, instance);
        dragonboneHoe = new ShapedRecipeBuilder(config, 89, instance);
        dragonboneSword = new ShapedRecipeBuilder(config, 90, instance);
        dragonboneBow = new ShapedRecipeBuilder(config, 91, instance);
        flamedDragonboneSword = new ShapelessRecipeBuilder(config, 92, instance);
        icedDragonboneSword = new ShapelessRecipeBuilder(config, 93, instance);
        lightningDragonboneSword = new ShapelessRecipeBuilder(config, 94, instance);
        fireDragonsteelSword = new ShapedRecipeBuilder(config, 95, instance);
        fireDragonsteelPickaxe = new ShapedRecipeBuilder(config, 96, instance);
        fireDragonsteelAxe = new ShapedRecipeBuilder(config, 97, instance);
        fireDragonsteelShovel = new ShapedRecipeBuilder(config, 98, instance);
        fireDragonsteelHoe = new ShapedRecipeBuilder(config, 99, instance);
        fireDragonsteelHelmet = new ShapedRecipeBuilder(config, 100, instance);
        fireDragonsteelChestplate = new ShapedRecipeBuilder(config, 101, instance);
        fireDragonsteelLeggings = new ShapedRecipeBuilder(config, 102, instance);
        fireDragonsteelBoots = new ShapedRecipeBuilder(config, 103, instance);
        iceDragonsteelSword = new ShapedRecipeBuilder(config, 104, instance);
        iceDragonsteelPickaxe = new ShapedRecipeBuilder(config, 105, instance);
        iceDragonsteelAxe = new ShapedRecipeBuilder(config, 106, instance);
        iceDragonsteelShovel = new ShapedRecipeBuilder(config, 107, instance);
        iceDragonsteelHoe = new ShapedRecipeBuilder(config, 108, instance);
        iceDragonsteelHelmet = new ShapedRecipeBuilder(config, 109, instance);
        iceDragonsteelChestplate = new ShapedRecipeBuilder(config, 110, instance);
        iceDragonsteelLeggings = new ShapedRecipeBuilder(config, 111, instance);
        iceDragonsteelBoots = new ShapedRecipeBuilder(config, 112, instance);
        lightningDragonsteelSword = new ShapedRecipeBuilder(config, 113, instance);
        lightningDragonsteelPickaxe = new ShapedRecipeBuilder(config, 114, instance);
        lightningDragonsteelAxe = new ShapedRecipeBuilder(config, 115, instance);
        lightningDragonsteelShovel = new ShapedRecipeBuilder(config, 116, instance);
        lightningDragonsteelHoe = new ShapedRecipeBuilder(config, 117, instance);
        lightningDragonsteelHelmet = new ShapedRecipeBuilder(config, 118, instance);
        lightningDragonsteelChestplate = new ShapedRecipeBuilder(config, 119, instance);
        lightningDragonsteelLeggings = new ShapedRecipeBuilder(config, 120, instance);
        lightningDragonsteelBoots = new ShapedRecipeBuilder(config, 121, instance);
        dragonboneRapier = new ShapedRecipeBuilder(config, 122, instance);
        dragonboneKatana = new ShapedRecipeBuilder(config, 123, instance);
        dragonboneGreatsword = new ShapedRecipeBuilder(config, 124, instance);
        dragonboneLongsword = new ShapedRecipeBuilder(config, 125, instance);
        dragonboneSpear = new ShapedRecipeBuilder(config, 126, instance);
        dragonboneSaber = new ShapedRecipeBuilder(config, 127, instance);
        dragonboneBoomerang = new ShapedRecipeBuilder(config, 128, instance);
        dragonboneDagger = new ShapedRecipeBuilder(config, 129, instance);
        dragonboneGlaive = new ShapedRecipeBuilder(config, 130, instance);
        dragonboneHalberd = new ShapedRecipeBuilder(config, 131, instance);
        dragonboneHammer = new ShapedRecipeBuilder(config, 132, instance);
        dragonboneJavelin = new ShapedRecipeBuilder(config, 133, instance);
        dragonboneLance = new ShapedRecipeBuilder(config, 134, instance);
        dragonboneMace = new ShapedRecipeBuilder(config, 135, instance);
        dragonbonePike = new ShapedRecipeBuilder(config, 136, instance);
        dragonboneQuarterstaff = new ShapedRecipeBuilder(config, 137, instance);
        dragonboneTomahawk = new ShapedRecipeBuilder(config, 138, instance);
        dragonboneThrowingKnife = new ShapedRecipeBuilder(config, 139, instance);
        dragonboneWarhammer = new ShapedRecipeBuilder(config, 140, instance);
        dragonboneBattleaxe = new ShapedRecipeBuilder(config, 141, instance);
        dragonboneLongbow = new ShapedRecipeBuilder(config, 142, instance);
        dragonboneCrossbow = new ShapedRecipeBuilder(config, 143, instance);
        flamedDragonboneRapier = new ShapedRecipeBuilder(config, 144, instance);
        flamedDragonboneKatana = new ShapedRecipeBuilder(config, 145, instance);
        flamedDragonboneGreatsword = new ShapedRecipeBuilder(config, 146, instance);
        flamedDragonboneLongsword = new ShapedRecipeBuilder(config, 147, instance);
        flamedDragonboneSpear = new ShapedRecipeBuilder(config, 148, instance);
        flamedDragonboneSaber = new ShapedRecipeBuilder(config, 149, instance);
        flamedDragonboneBoomerang = new ShapedRecipeBuilder(config, 150, instance);
        flamedDragonboneDagger = new ShapedRecipeBuilder(config, 151, instance);
        flamedDragonboneGlaive = new ShapedRecipeBuilder(config, 152, instance);
        flamedDragonboneHalberd = new ShapedRecipeBuilder(config, 153, instance);
        flamedDragonboneHammer = new ShapedRecipeBuilder(config, 154, instance);
        flamedDragonboneJavelin = new ShapedRecipeBuilder(config, 155, instance);
        flamedDragonboneLance = new ShapedRecipeBuilder(config, 156, instance);
        flamedDragonboneMace = new ShapedRecipeBuilder(config, 157, instance);
        flamedDragonbonePike = new ShapedRecipeBuilder(config, 158, instance);
        flamedDragonboneQuarterstaff = new ShapedRecipeBuilder(config, 159, instance);
        flamedDragonboneTomahawk = new ShapedRecipeBuilder(config, 160, instance);
        flamedDragonboneThrowingKnife = new ShapedRecipeBuilder(config, 161, instance);
        flamedDragonboneWarhammer = new ShapedRecipeBuilder(config, 162, instance);
        flamedDragonboneBattleaxe = new ShapedRecipeBuilder(config, 163, instance);
        flamedDragonboneLongbow = new ShapedRecipeBuilder(config, 164, instance);
        flamedDragonboneCrossbow = new ShapedRecipeBuilder(config, 165, instance);
        icedDragonboneRapier = new ShapedRecipeBuilder(config, 166, instance);
        icedDragonboneKatana = new ShapedRecipeBuilder(config, 167, instance);
        icedDragonboneGreatsword = new ShapedRecipeBuilder(config, 168, instance);
        icedDragonboneLongsword = new ShapedRecipeBuilder(config, 169, instance);
        icedDragonboneSpear = new ShapedRecipeBuilder(config, 170, instance);
        icedDragonboneSaber = new ShapedRecipeBuilder(config, 171, instance);
        icedDragonboneBoomerang = new ShapedRecipeBuilder(config, 172, instance);
        icedDragonboneDagger = new ShapedRecipeBuilder(config, 173, instance);
        icedDragonboneGlaive = new ShapedRecipeBuilder(config, 174, instance);
        icedDragonboneHalberd = new ShapedRecipeBuilder(config, 175, instance);
        icedDragonboneHammer = new ShapedRecipeBuilder(config, 176, instance);
        icedDragonboneJavelin = new ShapedRecipeBuilder(config, 177, instance);
        icedDragonboneLance = new ShapedRecipeBuilder(config, 178, instance);
        icedDragonboneMace = new ShapedRecipeBuilder(config, 179, instance);
        icedDragonbonePike = new ShapedRecipeBuilder(config, 180, instance);
        icedDragonboneQuarterstaff = new ShapedRecipeBuilder(config, 181, instance);
        icedDragonboneTomahawk = new ShapedRecipeBuilder(config, 182, instance);
        icedDragonboneThrowingKnife = new ShapedRecipeBuilder(config, 183, instance);
        icedDragonboneWarhammer = new ShapedRecipeBuilder(config, 184, instance);
        icedDragonboneBattleaxe = new ShapedRecipeBuilder(config, 185, instance);
        icedDragonboneLongbow = new ShapedRecipeBuilder(config, 186, instance);
        icedDragonboneCrossbow = new ShapedRecipeBuilder(config, 187, instance);
        lightningDragonboneRapier = new ShapedRecipeBuilder(config, 188, instance);
        lightningDragonboneKatana = new ShapedRecipeBuilder(config, 189, instance);
        lightningDragonboneGreatsword = new ShapedRecipeBuilder(config, 190, instance);
        lightningDragonboneLongsword = new ShapedRecipeBuilder(config, 191, instance);
        lightningDragonboneSpear = new ShapedRecipeBuilder(config, 192, instance);
        lightningDragonboneSaber = new ShapedRecipeBuilder(config, 193, instance);
        lightningDragonboneBoomerang = new ShapedRecipeBuilder(config, 194, instance);
        lightningDragonboneDagger = new ShapedRecipeBuilder(config, 195, instance);
        lightningDragonboneGlaive = new ShapedRecipeBuilder(config, 196, instance);
        lightningDragonboneHalberd = new ShapedRecipeBuilder(config, 197, instance);
        lightningDragonboneHammer = new ShapedRecipeBuilder(config, 198, instance);
        lightningDragonboneJavelin = new ShapedRecipeBuilder(config, 199, instance);
        lightningDragonboneLance = new ShapedRecipeBuilder(config, 200, instance);
        lightningDragonboneMace = new ShapedRecipeBuilder(config, 201, instance);
        lightningDragonbonePike = new ShapedRecipeBuilder(config, 202, instance);
        lightningDragonboneQuarterstaff = new ShapedRecipeBuilder(config, 203, instance);
        lightningDragonboneTomahawk = new ShapedRecipeBuilder(config, 204, instance);
        lightningDragonboneThrowingKnife = new ShapedRecipeBuilder(config, 205, instance);
        lightningDragonboneWarhammer = new ShapedRecipeBuilder(config, 206, instance);
        lightningDragonboneBattleaxe = new ShapedRecipeBuilder(config, 207, instance);
        lightningDragonboneLongbow = new ShapedRecipeBuilder(config, 208, instance);
        lightningDragonboneCrossbow = new ShapedRecipeBuilder(config, 209, instance);
        fireDragonsteelRapier = new ShapedRecipeBuilder(config, 210, instance);
        fireDragonsteelKatana = new ShapedRecipeBuilder(config, 211, instance);
        fireDragonsteelGreatsword = new ShapedRecipeBuilder(config, 212, instance);
        fireDragonsteelLongsword = new ShapedRecipeBuilder(config, 213, instance);
        fireDragonsteelSpear = new ShapedRecipeBuilder(config, 214, instance);
        fireDragonsteelSaber = new ShapedRecipeBuilder(config, 215, instance);
        fireDragonsteelBoomerang = new ShapedRecipeBuilder(config, 216, instance);
        fireDragonsteelDagger = new ShapedRecipeBuilder(config, 217, instance);
        fireDragonsteelGlaive = new ShapedRecipeBuilder(config, 218, instance);
        fireDragonsteelHalberd = new ShapedRecipeBuilder(config, 219, instance);
        fireDragonsteelHammer = new ShapedRecipeBuilder(config, 220, instance);
        fireDragonsteelJavelin = new ShapedRecipeBuilder(config, 221, instance);
        fireDragonsteelLance = new ShapedRecipeBuilder(config, 222, instance);
        fireDragonsteelMace = new ShapedRecipeBuilder(config, 223, instance);
        fireDragonsteelPike = new ShapedRecipeBuilder(config, 224, instance);
        fireDragonsteelQuarterstaff = new ShapedRecipeBuilder(config, 225, instance);
        fireDragonsteelTomahawk = new ShapedRecipeBuilder(config, 226, instance);
        fireDragonsteelThrowingKnife = new ShapedRecipeBuilder(config, 227, instance);
        fireDragonsteelWarhammer = new ShapedRecipeBuilder(config, 228, instance);
        fireDragonsteelBattleaxe = new ShapedRecipeBuilder(config, 229, instance);
        fireDragonsteelLongbow = new ShapedRecipeBuilder(config, 230, instance);
        fireDragonsteelCrossbow = new ShapedRecipeBuilder(config, 231, instance);
        iceDragonsteelRapier = new ShapedRecipeBuilder(config, 232, instance);
        iceDragonsteelKatana = new ShapedRecipeBuilder(config, 233, instance);
        iceDragonsteelGreatsword = new ShapedRecipeBuilder(config, 234, instance);
        iceDragonsteelLongsword = new ShapedRecipeBuilder(config, 235, instance);
        iceDragonsteelSpear = new ShapedRecipeBuilder(config, 236, instance);
        iceDragonsteelSaber = new ShapedRecipeBuilder(config, 237, instance);
        iceDragonsteelBoomerang = new ShapedRecipeBuilder(config, 238, instance);
        iceDragonsteelDagger = new ShapedRecipeBuilder(config, 239, instance);
        iceDragonsteelGlaive = new ShapedRecipeBuilder(config, 240, instance);
        iceDragonsteelHalberd = new ShapedRecipeBuilder(config, 241, instance);
        iceDragonsteelHammer = new ShapedRecipeBuilder(config, 242, instance);
        iceDragonsteelJavelin = new ShapedRecipeBuilder(config, 243, instance);
        iceDragonsteelLance = new ShapedRecipeBuilder(config, 244, instance);
        iceDragonsteelMace = new ShapedRecipeBuilder(config, 245, instance);
        iceDragonsteelPike = new ShapedRecipeBuilder(config, 246, instance);
        iceDragonsteelQuarterstaff = new ShapedRecipeBuilder(config, 247, instance);
        iceDragonsteelTomahawk = new ShapedRecipeBuilder(config, 248, instance);
        iceDragonsteelThrowingKnife = new ShapedRecipeBuilder(config, 249, instance);
        iceDragonsteelWarhammer = new ShapedRecipeBuilder(config, 250, instance);
        iceDragonsteelBattleaxe = new ShapedRecipeBuilder(config, 251, instance);
        iceDragonsteelLongbow = new ShapedRecipeBuilder(config, 252, instance);
        iceDragonsteelCrossbow = new ShapedRecipeBuilder(config, 253, instance);
        lightningDragonsteelRapier = new ShapedRecipeBuilder(config, 254, instance);
        lightningDragonsteelKatana = new ShapedRecipeBuilder(config, 255, instance);
        lightningDragonsteelGreatsword = new ShapedRecipeBuilder(config, 256, instance);
        lightningDragonsteelLongsword = new ShapedRecipeBuilder(config, 257, instance);
        lightningDragonsteelSpear = new ShapedRecipeBuilder(config, 258, instance);
        lightningDragonsteelSaber = new ShapedRecipeBuilder(config, 259, instance);
        lightningDragonsteelBoomerang = new ShapedRecipeBuilder(config, 260, instance);
        lightningDragonsteelDagger = new ShapedRecipeBuilder(config, 261, instance);
        lightningDragonsteelGlaive = new ShapedRecipeBuilder(config, 262, instance);
        lightningDragonsteelHalberd = new ShapedRecipeBuilder(config, 263, instance);
        lightningDragonsteelHammer = new ShapedRecipeBuilder(config, 264, instance);
        lightningDragonsteelJavelin = new ShapedRecipeBuilder(config, 265, instance);
        lightningDragonsteelLance = new ShapedRecipeBuilder(config, 266, instance);
        lightningDragonsteelMace = new ShapedRecipeBuilder(config, 267, instance);
        lightningDragonsteelPike = new ShapedRecipeBuilder(config, 268, instance);
        lightningDragonsteelQuarterstaff = new ShapedRecipeBuilder(config, 269, instance);
        lightningDragonsteelTomahawk = new ShapedRecipeBuilder(config, 270, instance);
        lightningDragonsteelThrowingKnife = new ShapedRecipeBuilder(config, 271, instance);
        lightningDragonsteelWarhammer = new ShapedRecipeBuilder(config, 272, instance);
        lightningDragonsteelBattleaxe = new ShapedRecipeBuilder(config, 273, instance);
        lightningDragonsteelLongbow = new ShapedRecipeBuilder(config, 274, instance);
        lightningDragonsteelCrossbow = new ShapedRecipeBuilder(config, 275, instance);
        netheriteRapier = new SmithingRecipeBuilder(config, 276, instance, true);
        netheriteKatana = new SmithingRecipeBuilder(config, 277, instance, true);
        netheriteGreatsword = new SmithingRecipeBuilder(config, 278, instance, true);
        netheriteLongsword = new SmithingRecipeBuilder(config, 279, instance, true);
        netheriteSpear = new SmithingRecipeBuilder(config, 280, instance, true);
        netheriteSaber = new SmithingRecipeBuilder(config, 281, instance, true);
        netheriteBoomerang = new SmithingRecipeBuilder(config, 282, instance, true);
        netheriteDagger = new SmithingRecipeBuilder(config, 283, instance, true);
        netheriteGlaive = new SmithingRecipeBuilder(config, 284, instance, true);
        netheriteHalberd = new SmithingRecipeBuilder(config, 285, instance, true);
        netheriteHammer = new SmithingRecipeBuilder(config, 286, instance, true);
        netheriteJavelin = new SmithingRecipeBuilder(config, 287, instance, true);
        netheriteLance = new SmithingRecipeBuilder(config, 288, instance, true);
        netheriteMace = new SmithingRecipeBuilder(config, 289, instance, true);
        netheritePike = new SmithingRecipeBuilder(config, 290, instance, true);
        netheriteQuarterstaff = new SmithingRecipeBuilder(config, 291, instance, true);
        netheriteTomahawk = new SmithingRecipeBuilder(config, 292, instance, true);
        netheriteThrowingKnife = new SmithingRecipeBuilder(config, 293, instance, true);
        netheriteWarhammer = new SmithingRecipeBuilder(config, 294, instance, true);
        netheriteBattleaxe = new SmithingRecipeBuilder(config, 295, instance, true);
        netheriteLongbow = new SmithingRecipeBuilder(config, 296, instance, true);
        netheriteCrossbow = new SmithingRecipeBuilder(config, 297, instance, true);
        diamondRapier = new ShapedRecipeBuilder(config, 298, instance);
        diamondKatana = new ShapedRecipeBuilder(config, 299, instance);
        diamondGreatsword = new ShapedRecipeBuilder(config, 300, instance);
        diamondLongsword = new ShapedRecipeBuilder(config, 301, instance);
        diamondSpear = new ShapedRecipeBuilder(config, 302, instance);
        diamondSaber = new ShapedRecipeBuilder(config, 303, instance);
        diamondBoomerang = new ShapedRecipeBuilder(config, 304, instance);
        diamondDagger = new ShapedRecipeBuilder(config, 305, instance);
        diamondGlaive = new ShapedRecipeBuilder(config, 306, instance);
        diamondHalberd = new ShapedRecipeBuilder(config, 307, instance);
        diamondHammer = new ShapedRecipeBuilder(config, 308, instance);
        diamondJavelin = new ShapedRecipeBuilder(config, 309, instance);
        diamondLance = new ShapedRecipeBuilder(config, 310, instance);
        diamondMace = new ShapedRecipeBuilder(config, 311, instance);
        diamondPike = new ShapedRecipeBuilder(config, 312, instance);
        diamondQuarterstaff = new ShapedRecipeBuilder(config, 313, instance);
        diamondTomahawk = new ShapedRecipeBuilder(config, 314, instance);
        diamondThrowingKnife = new ShapedRecipeBuilder(config, 315, instance);
        diamondWarhammer = new ShapedRecipeBuilder(config, 316, instance);
        diamondBattleaxe = new ShapedRecipeBuilder(config, 317, instance);
        diamondLongbow = new ShapedRecipeBuilder(config, 318, instance);
        diamondCrossbow = new ShapedRecipeBuilder(config, 319, instance);
        ironRapier = new ShapedRecipeBuilder(config, 320, instance);
        ironKatana = new ShapedRecipeBuilder(config, 321, instance);
        ironGreatsword = new ShapedRecipeBuilder(config, 322, instance);
        ironLongsword = new ShapedRecipeBuilder(config, 323, instance);
        ironSpear = new ShapedRecipeBuilder(config, 324, instance);
        ironSaber = new ShapedRecipeBuilder(config, 325, instance);
        ironBoomerang = new ShapedRecipeBuilder(config, 326, instance);
        ironDagger = new ShapedRecipeBuilder(config, 327, instance);
        ironGlaive = new ShapedRecipeBuilder(config, 328, instance);
        ironHalberd = new ShapedRecipeBuilder(config, 329, instance);
        ironHammer = new ShapedRecipeBuilder(config, 330, instance);
        ironJavelin = new ShapedRecipeBuilder(config, 331, instance);
        ironLance = new ShapedRecipeBuilder(config, 332, instance);
        ironMace = new ShapedRecipeBuilder(config, 333, instance);
        ironPike = new ShapedRecipeBuilder(config, 334, instance);
        ironQuarterstaff = new ShapedRecipeBuilder(config, 335, instance);
        ironTomahawk = new ShapedRecipeBuilder(config, 336, instance);
        ironThrowingKnife = new ShapedRecipeBuilder(config, 337, instance);
        ironWarhammer = new ShapedRecipeBuilder(config, 338, instance);
        ironBattleaxe = new ShapedRecipeBuilder(config, 339, instance);
        ironLongbow = new ShapedRecipeBuilder(config, 340, instance);
        ironCrossbow = new ShapedRecipeBuilder(config, 341, instance);
        goldRapier = new ShapedRecipeBuilder(config, 342, instance);
        goldKatana = new ShapedRecipeBuilder(config, 343, instance);
        goldGreatsword = new ShapedRecipeBuilder(config, 344, instance);
        goldLongsword = new ShapedRecipeBuilder(config, 345, instance);
        goldSpear = new ShapedRecipeBuilder(config, 346, instance);
        goldSaber = new ShapedRecipeBuilder(config, 347, instance);
        goldBoomerang = new ShapedRecipeBuilder(config, 348, instance);
        goldDagger = new ShapedRecipeBuilder(config, 349, instance);
        goldGlaive = new ShapedRecipeBuilder(config, 350, instance);
        goldHalberd = new ShapedRecipeBuilder(config, 351, instance);
        goldHammer = new ShapedRecipeBuilder(config, 352, instance);
        goldJavelin = new ShapedRecipeBuilder(config, 353, instance);
        goldLance = new ShapedRecipeBuilder(config, 354, instance);
        goldMace = new ShapedRecipeBuilder(config, 355, instance);
        goldPike = new ShapedRecipeBuilder(config, 356, instance);
        goldQuarterstaff = new ShapedRecipeBuilder(config, 357, instance);
        goldTomahawk = new ShapedRecipeBuilder(config, 358, instance);
        goldThrowingKnife = new ShapedRecipeBuilder(config, 359, instance);
        goldWarhammer = new ShapedRecipeBuilder(config, 360, instance);
        goldBattleaxe = new ShapedRecipeBuilder(config, 361, instance);
        goldLongbow = new ShapedRecipeBuilder(config, 362, instance);
        goldCrossbow = new ShapedRecipeBuilder(config, 363, instance);
        stoneRapier = new ShapedRecipeBuilder(config, 364, instance);
        stoneKatana = new ShapedRecipeBuilder(config, 365, instance);
        stoneGreatsword = new ShapedRecipeBuilder(config, 366, instance);
        stoneLongsword = new ShapedRecipeBuilder(config, 367, instance);
        stoneSpear = new ShapedRecipeBuilder(config, 368, instance);
        stoneSaber = new ShapedRecipeBuilder(config, 369, instance);
        stoneBoomerang = new ShapedRecipeBuilder(config, 370, instance);
        stoneDagger = new ShapedRecipeBuilder(config, 371, instance);
        stoneGlaive = new ShapedRecipeBuilder(config, 372, instance);
        stoneHalberd = new ShapedRecipeBuilder(config, 373, instance);
        stoneHammer = new ShapedRecipeBuilder(config, 374, instance);
        stoneJavelin = new ShapedRecipeBuilder(config, 375, instance);
        stoneLance = new ShapedRecipeBuilder(config, 376, instance);
        stoneMace = new ShapedRecipeBuilder(config, 377, instance);
        stonePike = new ShapedRecipeBuilder(config, 378, instance);
        stoneQuarterstaff = new ShapedRecipeBuilder(config, 379, instance);
        stoneTomahawk = new ShapedRecipeBuilder(config, 380, instance);
        stoneThrowingKnife = new ShapedRecipeBuilder(config, 381, instance);
        stoneWarhammer = new ShapedRecipeBuilder(config, 382, instance);
        stoneBattleaxe = new ShapedRecipeBuilder(config, 383, instance);
        leatherLongbow = new ShapedRecipeBuilder(config, 384, instance);
        leatherCrossbow = new ShapedRecipeBuilder(config, 385, instance);
        woodenRapier = new ShapedRecipeBuilder(config, 386, instance);
        woodenKatana = new ShapedRecipeBuilder(config, 387, instance);
        woodenGreatsword = new ShapedRecipeBuilder(config, 388, instance);
        woodenLongsword = new ShapedRecipeBuilder(config, 389, instance);
        woodenSpear = new ShapedRecipeBuilder(config, 390, instance);
        woodenSaber = new ShapedRecipeBuilder(config, 391, instance);
        woodenBoomerang = new ShapedRecipeBuilder(config, 392, instance);
        woodenDagger = new ShapedRecipeBuilder(config, 393, instance);
        woodenGlaive = new ShapedRecipeBuilder(config, 394, instance);
        woodenHalberd = new ShapedRecipeBuilder(config, 395, instance);
        woodenHammer = new ShapedRecipeBuilder(config, 396, instance);
        woodenJavelin = new ShapedRecipeBuilder(config, 397, instance);
        woodenLance = new ShapedRecipeBuilder(config, 398, instance);
        woodenMace = new ShapedRecipeBuilder(config, 399, instance);
        woodenPike = new ShapedRecipeBuilder(config, 400, instance);
        woodenQuarterstaff = new ShapedRecipeBuilder(config, 401, instance);
        woodenTomahawk = new ShapedRecipeBuilder(config, 402, instance);
        woodenThrowingKnife = new ShapedRecipeBuilder(config, 403, instance);
        woodenWarhammer = new ShapedRecipeBuilder(config, 404, instance);
        woodenBattleaxe = new ShapedRecipeBuilder(config, 405, instance);
        woodenLongbow = new ShapedRecipeBuilder(config, 406, instance);
        woodenCrossbow = new ShapedRecipeBuilder(config, 407, instance);
        copperRapier = new ShapedRecipeBuilder(config, 408, instance);
        copperKatana = new ShapedRecipeBuilder(config, 409, instance);
        copperGreatsword = new ShapedRecipeBuilder(config, 410, instance);
        copperLongsword = new ShapedRecipeBuilder(config, 411, instance);
        copperSpear = new ShapedRecipeBuilder(config, 412, instance);
        copperSaber = new ShapedRecipeBuilder(config, 413, instance);
        copperBoomerang = new ShapedRecipeBuilder(config, 414, instance);
        copperDagger = new ShapedRecipeBuilder(config, 415, instance);
        copperGlaive = new ShapedRecipeBuilder(config, 416, instance);
        copperHalberd = new ShapedRecipeBuilder(config, 417, instance);
        copperHammer = new ShapedRecipeBuilder(config, 418, instance);
        copperJavelin = new ShapedRecipeBuilder(config, 419, instance);
        copperLance = new ShapedRecipeBuilder(config, 420, instance);
        copperMace = new ShapedRecipeBuilder(config, 421, instance);
        copperPike = new ShapedRecipeBuilder(config, 422, instance);
        copperQuarterstaff = new ShapedRecipeBuilder(config, 423, instance);
        copperTomahawk = new ShapedRecipeBuilder(config, 424, instance);
        copperThrowingKnife = new ShapedRecipeBuilder(config, 425, instance);
        copperWarhammer = new ShapedRecipeBuilder(config, 426, instance);
        copperBattleaxe = new ShapedRecipeBuilder(config, 427, instance);
        copperLongbow = new ShapedRecipeBuilder(config, 428, instance);
        copperCrossbow = new ShapedRecipeBuilder(config, 429, instance);
        handle0 = new ShapelessRecipeBuilder(config, 430, instance);
        handle1 = new ShapedRecipeBuilder(config, 431, instance);
        handle2 = new ShapedRecipeBuilder(config, 432, instance);
        pole0 = new ShapedRecipeBuilder(config, 433, instance);
        pole1 = new ShapedRecipeBuilder(config, 434, instance);
        pole2 = new ShapedRecipeBuilder(config, 435, instance);
        witherboneHandle = new ShapelessRecipeBuilder(config, 436, instance);
        witherbonePole = new ShapelessRecipeBuilder(config, 437, instance);
        balloon = new ShapedRecipeBuilder(config, 438, instance);
        cobaltShield = new ShapedRecipeBuilder(config, 439, instance);
        obsidianSkull = new ShapedRecipeBuilder(config, 440, instance);
        sunglasses = new ShapedRecipeBuilder(config, 441, instance);
        crackedBlackDragonscale = new ShapedRecipeBuilder(config, 442, instance);
        blackDragonscale = new ShapedRecipeBuilder(config, 443, instance);
        ankhCharm = new ShapedRecipeBuilder(config, 444, instance);
        warpedScroll = new ShapedRecipeBuilder(config, 445, instance);
        fireDragonsteelBlock = new ShapedRecipeBuilder(config, 446, instance);
        iceDragonsteelBlock = new ShapedRecipeBuilder(config, 447, instance);
        lightningDragonsteelBlock = new ShapedRecipeBuilder(config, 448, instance);
        fireDragonsteelIngot1 = new ShapelessRecipeBuilder(config, 449, instance);
        iceDragonsteelIngot1 = new ShapelessRecipeBuilder(config, 450, instance);
        lightningDragonsteelIngot1 = new ShapelessRecipeBuilder(config, 451, instance);
        woodenClub = new ShapedRecipeBuilder(config, 452, instance);
        studdedClub = new ShapelessRecipeBuilder(config, 453, instance);

    }

    public void populateNtrRecipes() {
        ntrRecipes.add(flintAxe);
        ntrRecipes.add(flintKnife);
        ntrRecipes.add(flintPickaxe);
        ntrRecipes.add(flintShovel);
        ntrRecipes.add(flintHoe);
        ntrRecipes.add(cobblestone);
        ntrRecipes.add(plantString);
    }

    public void populateBaubleRecipes() {
        baubleRecipes.add(balloon);
        baubleRecipes.add(cobaltShield);
        baubleRecipes.add(obsidianSkull);
        baubleRecipes.add(sunglasses);
        baubleRecipes.add(crackedBlackDragonscale);
        baubleRecipes.add(blackDragonscale);
        baubleRecipes.add(ankhCharm);
    }

    public void populateDragonRecipes() {
        dragonRecipes.add(fireDragonsteelIngot0);
        dragonRecipes.add(iceDragonsteelIngot0);
        dragonRecipes.add(lightningDragonsteelIngot0);

        dragonRecipes.add(fireDragonsteelIngot1);
        dragonRecipes.add(iceDragonsteelIngot1);
        dragonRecipes.add(lightningDragonsteelIngot1);

        dragonRecipes.add(fireDragonsteelBlock);
        dragonRecipes.add(iceDragonsteelBlock);
        dragonRecipes.add(lightningDragonsteelBlock);

        dragonRecipes.add(blueDragonscaleHelmet);
        dragonRecipes.add(blueDragonscaleChestplate);
        dragonRecipes.add(blueDragonscaleLeggings);
        dragonRecipes.add(blueDragonscaleBoots);

        dragonRecipes.add(bronzeDragonscaleHelmet);
        dragonRecipes.add(bronzeDragonscaleChestplate);
        dragonRecipes.add(bronzeDragonscaleLeggings);
        dragonRecipes.add(bronzeDragonscaleBoots);

        dragonRecipes.add(grayDragonscaleHelmet);
        dragonRecipes.add(grayDragonscaleChestplate);
        dragonRecipes.add(grayDragonscaleLeggings);
        dragonRecipes.add(grayDragonscaleBoots);

        dragonRecipes.add(greenDragonscaleHelmet);
        dragonRecipes.add(greenDragonscaleChestplate);
        dragonRecipes.add(greenDragonscaleLeggings);
        dragonRecipes.add(greenDragonscaleBoots);

        dragonRecipes.add(redDragonscaleHelmet);
        dragonRecipes.add(redDragonscaleChestplate);
        dragonRecipes.add(redDragonscaleLeggings);
        dragonRecipes.add(redDragonscaleBoots);

        dragonRecipes.add(sapphireDragonscaleHelmet);
        dragonRecipes.add(sapphireDragonscaleChestplate);
        dragonRecipes.add(sapphireDragonscaleLeggings);
        dragonRecipes.add(sapphireDragonscaleBoots);

        dragonRecipes.add(silverDragonscaleHelmet);
        dragonRecipes.add(silverDragonscaleChestplate);
        dragonRecipes.add(silverDragonscaleLeggings);
        dragonRecipes.add(silverDragonscaleBoots);

        dragonRecipes.add(whiteDragonscaleHelmet);
        dragonRecipes.add(whiteDragonscaleChestplate);
        dragonRecipes.add(whiteDragonscaleLeggings);
        dragonRecipes.add(whiteDragonscaleBoots);

        dragonRecipes.add(amethystDragonscaleHelmet);
        dragonRecipes.add(amethystDragonscaleChestplate);
        dragonRecipes.add(amethystDragonscaleLeggings);
        dragonRecipes.add(amethystDragonscaleBoots);

        dragonRecipes.add(blackDragonscaleHelmet);
        dragonRecipes.add(blackDragonscaleChestplate);
        dragonRecipes.add(blackDragonscaleLeggings);
        dragonRecipes.add(blackDragonscaleBoots);

        dragonRecipes.add(copperDragonscaleHelmet);
        dragonRecipes.add(copperDragonscaleChestplate);
        dragonRecipes.add(copperDragonscaleLeggings);
        dragonRecipes.add(copperDragonscaleBoots);

        dragonRecipes.add(electricDragonscaleHelmet);
        dragonRecipes.add(electricDragonscaleChestplate);
        dragonRecipes.add(electricDragonscaleLeggings);
        dragonRecipes.add(electricDragonscaleBoots);

        dragonRecipes.add(dragonbonePickaxe);
        dragonRecipes.add(dragonboneShovel);
        dragonRecipes.add(dragonboneHoe);
        dragonRecipes.add(dragonboneSword);
        dragonRecipes.add(dragonboneBow);
        dragonRecipes.add(flamedDragonboneSword);
        dragonRecipes.add(icedDragonboneSword);
        dragonRecipes.add(lightningDragonboneSword);
    }

    public void populateSeaSerpentRecipes() {
        seaSerpentRecipes.add(blueTideGuardianHelmet);
        seaSerpentRecipes.add(blueTideGuardianChestplate);
        seaSerpentRecipes.add(blueTideGuardianLeggings);
        seaSerpentRecipes.add(blueTideGuardianBoots);

        seaSerpentRecipes.add(bronzeTideGuardianHelmet);
        seaSerpentRecipes.add(bronzeTideGuardianChestplate);
        seaSerpentRecipes.add(bronzeTideGuardianLeggings);
        seaSerpentRecipes.add(bronzeTideGuardianBoots);

        seaSerpentRecipes.add(deepblueTideGuardianHelmet);
        seaSerpentRecipes.add(deepblueTideGuardianChestplate);
        seaSerpentRecipes.add(deepblueTideGuardianLeggings);
        seaSerpentRecipes.add(deepblueTideGuardianBoots);

        seaSerpentRecipes.add(greenTideGuardianHelmet);
        seaSerpentRecipes.add(greenTideGuardianChestplate);
        seaSerpentRecipes.add(greenTideGuardianLeggings);
        seaSerpentRecipes.add(greenTideGuardianBoots);

        seaSerpentRecipes.add(purpleTideGuardianHelmet);
        seaSerpentRecipes.add(purpleTideGuardianChestplate);
        seaSerpentRecipes.add(purpleTideGuardianLeggings);
        seaSerpentRecipes.add(purpleTideGuardianBoots);

        seaSerpentRecipes.add(redTideGuardianHelmet);
        seaSerpentRecipes.add(redTideGuardianChestplate);
        seaSerpentRecipes.add(redTideGuardianLeggings);
        seaSerpentRecipes.add(redTideGuardianBoots);

        seaSerpentRecipes.add(tealTideGuardianHelmet);
        seaSerpentRecipes.add(tealTideGuardianChestplate);
        seaSerpentRecipes.add(tealTideGuardianLeggings);
        seaSerpentRecipes.add(tealTideGuardianBoots);
    }

    public void populateSpartanWeaponryRecipes() {
        spartanWeaponryRecipes.add(dragonboneRapier);
        spartanWeaponryRecipes.add(dragonboneKatana);
        spartanWeaponryRecipes.add(dragonboneGreatsword);
        spartanWeaponryRecipes.add(dragonboneLongsword);
        spartanWeaponryRecipes.add(dragonboneSpear);
        spartanWeaponryRecipes.add(dragonboneSaber);
        spartanWeaponryRecipes.add(dragonboneBoomerang);
        spartanWeaponryRecipes.add(dragonboneDagger);
        spartanWeaponryRecipes.add(dragonboneGlaive);
        spartanWeaponryRecipes.add(dragonboneHalberd);
        spartanWeaponryRecipes.add(dragonboneHammer);
        spartanWeaponryRecipes.add(dragonboneJavelin);
        spartanWeaponryRecipes.add(dragonboneLance);
        spartanWeaponryRecipes.add(dragonboneMace);
        spartanWeaponryRecipes.add(dragonbonePike);
        spartanWeaponryRecipes.add(dragonboneQuarterstaff);
        spartanWeaponryRecipes.add(dragonboneTomahawk);
        spartanWeaponryRecipes.add(dragonboneThrowingKnife);
        spartanWeaponryRecipes.add(dragonboneWarhammer);
        spartanWeaponryRecipes.add(dragonboneBattleaxe);
        spartanWeaponryRecipes.add(dragonboneLongbow);
        spartanWeaponryRecipes.add(dragonboneCrossbow);
        spartanWeaponryRecipes.add(flamedDragonboneRapier);
        spartanWeaponryRecipes.add(flamedDragonboneKatana);
        spartanWeaponryRecipes.add(flamedDragonboneGreatsword);
        spartanWeaponryRecipes.add(flamedDragonboneLongsword);
        spartanWeaponryRecipes.add(flamedDragonboneSpear);
        spartanWeaponryRecipes.add(flamedDragonboneSaber);
        spartanWeaponryRecipes.add(flamedDragonboneBoomerang);
        spartanWeaponryRecipes.add(flamedDragonboneDagger);
        spartanWeaponryRecipes.add(flamedDragonboneGlaive);
        spartanWeaponryRecipes.add(flamedDragonboneHalberd);
        spartanWeaponryRecipes.add(flamedDragonboneHammer);
        spartanWeaponryRecipes.add(flamedDragonboneJavelin);
        spartanWeaponryRecipes.add(flamedDragonboneLance);
        spartanWeaponryRecipes.add(flamedDragonboneMace);
        spartanWeaponryRecipes.add(flamedDragonbonePike);
        spartanWeaponryRecipes.add(flamedDragonboneQuarterstaff);
        spartanWeaponryRecipes.add(flamedDragonboneTomahawk);
        spartanWeaponryRecipes.add(flamedDragonboneThrowingKnife);
        spartanWeaponryRecipes.add(flamedDragonboneWarhammer);
        spartanWeaponryRecipes.add(flamedDragonboneBattleaxe);
        spartanWeaponryRecipes.add(flamedDragonboneLongbow);
        spartanWeaponryRecipes.add(flamedDragonboneCrossbow);
        spartanWeaponryRecipes.add(icedDragonboneRapier);
        spartanWeaponryRecipes.add(icedDragonboneKatana);
        spartanWeaponryRecipes.add(icedDragonboneGreatsword);
        spartanWeaponryRecipes.add(icedDragonboneLongsword);
        spartanWeaponryRecipes.add(icedDragonboneSpear);
        spartanWeaponryRecipes.add(icedDragonboneSaber);
        spartanWeaponryRecipes.add(icedDragonboneBoomerang);
        spartanWeaponryRecipes.add(icedDragonboneDagger);
        spartanWeaponryRecipes.add(icedDragonboneGlaive);
        spartanWeaponryRecipes.add(icedDragonboneHalberd);
        spartanWeaponryRecipes.add(icedDragonboneHammer);
        spartanWeaponryRecipes.add(icedDragonboneJavelin);
        spartanWeaponryRecipes.add(icedDragonboneLance);
        spartanWeaponryRecipes.add(icedDragonboneMace);
        spartanWeaponryRecipes.add(icedDragonbonePike);
        spartanWeaponryRecipes.add(icedDragonboneQuarterstaff);
        spartanWeaponryRecipes.add(icedDragonboneTomahawk);
        spartanWeaponryRecipes.add(icedDragonboneThrowingKnife);
        spartanWeaponryRecipes.add(icedDragonboneWarhammer);
        spartanWeaponryRecipes.add(icedDragonboneBattleaxe);
        spartanWeaponryRecipes.add(icedDragonboneLongbow);
        spartanWeaponryRecipes.add(icedDragonboneCrossbow);
//        spartanWeaponryRecipes.add(lightningDragonboneRapier);
//        spartanWeaponryRecipes.add(lightningDragonboneKatana);
//        spartanWeaponryRecipes.add(lightningDragonboneGreatsword);
//        spartanWeaponryRecipes.add(lightningDragonboneLongsword);
//        spartanWeaponryRecipes.add(lightningDragonboneSpear);
//        spartanWeaponryRecipes.add(lightningDragonboneSaber);
//        spartanWeaponryRecipes.add(lightningDragonboneBoomerang);
//        spartanWeaponryRecipes.add(lightningDragonboneDagger);
//        spartanWeaponryRecipes.add(lightningDragonboneGlaive);
//        spartanWeaponryRecipes.add(lightningDragonboneHalberd);
//        spartanWeaponryRecipes.add(lightningDragonboneHammer);
//        spartanWeaponryRecipes.add(lightningDragonboneJavelin);
//        spartanWeaponryRecipes.add(lightningDragonboneLance);
//        spartanWeaponryRecipes.add(lightningDragonboneMace);
//        spartanWeaponryRecipes.add(lightningDragonbonePike);
//        spartanWeaponryRecipes.add(lightningDragonboneQuarterstaff);
//        spartanWeaponryRecipes.add(lightningDragonboneTomahawk);
//        spartanWeaponryRecipes.add(lightningDragonboneThrowingKnife);
//        spartanWeaponryRecipes.add(lightningDragonboneWarhammer);
//        spartanWeaponryRecipes.add(lightningDragonboneBattleaxe);
//        spartanWeaponryRecipes.add(lightningDragonboneLongbow);
//        spartanWeaponryRecipes.add(lightningDragonboneCrossbow);
        spartanWeaponryRecipes.add(fireDragonsteelRapier);
        spartanWeaponryRecipes.add(fireDragonsteelKatana);
        spartanWeaponryRecipes.add(fireDragonsteelGreatsword);
        spartanWeaponryRecipes.add(fireDragonsteelLongsword);
        spartanWeaponryRecipes.add(fireDragonsteelSpear);
        spartanWeaponryRecipes.add(fireDragonsteelSaber);
        spartanWeaponryRecipes.add(fireDragonsteelBoomerang);
        spartanWeaponryRecipes.add(fireDragonsteelDagger);
        spartanWeaponryRecipes.add(fireDragonsteelGlaive);
        spartanWeaponryRecipes.add(fireDragonsteelHalberd);
        spartanWeaponryRecipes.add(fireDragonsteelHammer);
        spartanWeaponryRecipes.add(fireDragonsteelJavelin);
        spartanWeaponryRecipes.add(fireDragonsteelLance);
        spartanWeaponryRecipes.add(fireDragonsteelMace);
        spartanWeaponryRecipes.add(fireDragonsteelPike);
        spartanWeaponryRecipes.add(fireDragonsteelQuarterstaff);
        spartanWeaponryRecipes.add(fireDragonsteelTomahawk);
        spartanWeaponryRecipes.add(fireDragonsteelThrowingKnife);
        spartanWeaponryRecipes.add(fireDragonsteelWarhammer);
        spartanWeaponryRecipes.add(fireDragonsteelBattleaxe);
        spartanWeaponryRecipes.add(fireDragonsteelLongbow);
        spartanWeaponryRecipes.add(fireDragonsteelCrossbow);
        spartanWeaponryRecipes.add(iceDragonsteelRapier);
        spartanWeaponryRecipes.add(iceDragonsteelKatana);
        spartanWeaponryRecipes.add(iceDragonsteelGreatsword);
        spartanWeaponryRecipes.add(iceDragonsteelLongsword);
        spartanWeaponryRecipes.add(iceDragonsteelSpear);
        spartanWeaponryRecipes.add(iceDragonsteelSaber);
        spartanWeaponryRecipes.add(iceDragonsteelBoomerang);
        spartanWeaponryRecipes.add(iceDragonsteelDagger);
        spartanWeaponryRecipes.add(iceDragonsteelGlaive);
        spartanWeaponryRecipes.add(iceDragonsteelHalberd);
        spartanWeaponryRecipes.add(iceDragonsteelHammer);
        spartanWeaponryRecipes.add(iceDragonsteelJavelin);
        spartanWeaponryRecipes.add(iceDragonsteelLance);
        spartanWeaponryRecipes.add(iceDragonsteelMace);
        spartanWeaponryRecipes.add(iceDragonsteelPike);
        spartanWeaponryRecipes.add(iceDragonsteelQuarterstaff);
        spartanWeaponryRecipes.add(iceDragonsteelTomahawk);
        spartanWeaponryRecipes.add(iceDragonsteelThrowingKnife);
        spartanWeaponryRecipes.add(iceDragonsteelWarhammer);
        spartanWeaponryRecipes.add(iceDragonsteelBattleaxe);
        spartanWeaponryRecipes.add(iceDragonsteelLongbow);
        spartanWeaponryRecipes.add(iceDragonsteelCrossbow);
//        spartanWeaponryRecipes.add(lightningDragonsteelRapier);
//        spartanWeaponryRecipes.add(lightningDragonsteelKatana);
//        spartanWeaponryRecipes.add(lightningDragonsteelGreatsword);
//        spartanWeaponryRecipes.add(lightningDragonsteelLongsword);
//        spartanWeaponryRecipes.add(lightningDragonsteelSpear);
//        spartanWeaponryRecipes.add(lightningDragonsteelSaber);
//        spartanWeaponryRecipes.add(lightningDragonsteelBoomerang);
//        spartanWeaponryRecipes.add(lightningDragonsteelDagger);
//        spartanWeaponryRecipes.add(lightningDragonsteelGlaive);
//        spartanWeaponryRecipes.add(lightningDragonsteelHalberd);
//        spartanWeaponryRecipes.add(lightningDragonsteelHammer);
//        spartanWeaponryRecipes.add(lightningDragonsteelJavelin);
//        spartanWeaponryRecipes.add(lightningDragonsteelLance);
//        spartanWeaponryRecipes.add(lightningDragonsteelMace);
//        spartanWeaponryRecipes.add(lightningDragonsteelPike);
//        spartanWeaponryRecipes.add(lightningDragonsteelQuarterstaff);
//        spartanWeaponryRecipes.add(lightningDragonsteelTomahawk);
//        spartanWeaponryRecipes.add(lightningDragonsteelThrowingKnife);
//        spartanWeaponryRecipes.add(lightningDragonsteelWarhammer);
//        spartanWeaponryRecipes.add(lightningDragonsteelBattleaxe);
//        spartanWeaponryRecipes.add(lightningDragonsteelLongbow);
//        spartanWeaponryRecipes.add(lightningDragonsteelCrossbow);
        spartanWeaponryRecipes.add(netheriteRapier);
        spartanWeaponryRecipes.add(netheriteKatana);
        spartanWeaponryRecipes.add(netheriteGreatsword);
        spartanWeaponryRecipes.add(netheriteLongsword);
        spartanWeaponryRecipes.add(netheriteSpear);
        spartanWeaponryRecipes.add(netheriteSaber);
        spartanWeaponryRecipes.add(netheriteBoomerang);
        spartanWeaponryRecipes.add(netheriteDagger);
        spartanWeaponryRecipes.add(netheriteGlaive);
        spartanWeaponryRecipes.add(netheriteHalberd);
        spartanWeaponryRecipes.add(netheriteHammer);
        spartanWeaponryRecipes.add(netheriteJavelin);
        spartanWeaponryRecipes.add(netheriteLance);
        spartanWeaponryRecipes.add(netheriteMace);
        spartanWeaponryRecipes.add(netheritePike);
        spartanWeaponryRecipes.add(netheriteQuarterstaff);
        spartanWeaponryRecipes.add(netheriteTomahawk);
        spartanWeaponryRecipes.add(netheriteThrowingKnife);
        spartanWeaponryRecipes.add(netheriteWarhammer);
        spartanWeaponryRecipes.add(netheriteBattleaxe);
        spartanWeaponryRecipes.add(netheriteLongbow);
        spartanWeaponryRecipes.add(netheriteCrossbow);
        spartanWeaponryRecipes.add(diamondRapier);
        spartanWeaponryRecipes.add(diamondKatana);
        spartanWeaponryRecipes.add(diamondGreatsword);
        spartanWeaponryRecipes.add(diamondLongsword);
        spartanWeaponryRecipes.add(diamondSpear);
        spartanWeaponryRecipes.add(diamondSaber);
        spartanWeaponryRecipes.add(diamondBoomerang);
        spartanWeaponryRecipes.add(diamondDagger);
        spartanWeaponryRecipes.add(diamondGlaive);
        spartanWeaponryRecipes.add(diamondHalberd);
        spartanWeaponryRecipes.add(diamondHammer);
        spartanWeaponryRecipes.add(diamondJavelin);
        spartanWeaponryRecipes.add(diamondLance);
        spartanWeaponryRecipes.add(diamondMace);
        spartanWeaponryRecipes.add(diamondPike);
        spartanWeaponryRecipes.add(diamondQuarterstaff);
        spartanWeaponryRecipes.add(diamondTomahawk);
        spartanWeaponryRecipes.add(diamondThrowingKnife);
        spartanWeaponryRecipes.add(diamondWarhammer);
        spartanWeaponryRecipes.add(diamondBattleaxe);
        spartanWeaponryRecipes.add(diamondLongbow);
        spartanWeaponryRecipes.add(diamondCrossbow);
        spartanWeaponryRecipes.add(ironRapier);
        spartanWeaponryRecipes.add(ironKatana);
        spartanWeaponryRecipes.add(ironGreatsword);
        spartanWeaponryRecipes.add(ironLongsword);
        spartanWeaponryRecipes.add(ironSpear);
        spartanWeaponryRecipes.add(ironSaber);
        spartanWeaponryRecipes.add(ironBoomerang);
        spartanWeaponryRecipes.add(ironDagger);
        spartanWeaponryRecipes.add(ironGlaive);
        spartanWeaponryRecipes.add(ironHalberd);
        spartanWeaponryRecipes.add(ironHammer);
        spartanWeaponryRecipes.add(ironJavelin);
        spartanWeaponryRecipes.add(ironLance);
        spartanWeaponryRecipes.add(ironMace);
        spartanWeaponryRecipes.add(ironPike);
        spartanWeaponryRecipes.add(ironQuarterstaff);
        spartanWeaponryRecipes.add(ironTomahawk);
        spartanWeaponryRecipes.add(ironThrowingKnife);
        spartanWeaponryRecipes.add(ironWarhammer);
        spartanWeaponryRecipes.add(ironBattleaxe);
        spartanWeaponryRecipes.add(studdedClub);
        spartanWeaponryRecipes.add(ironLongbow);
        spartanWeaponryRecipes.add(ironCrossbow);
        spartanWeaponryRecipes.add(goldRapier);
        spartanWeaponryRecipes.add(goldKatana);
        spartanWeaponryRecipes.add(goldGreatsword);
        spartanWeaponryRecipes.add(goldLongsword);
        spartanWeaponryRecipes.add(goldSpear);
        spartanWeaponryRecipes.add(goldSaber);
        spartanWeaponryRecipes.add(goldBoomerang);
        spartanWeaponryRecipes.add(goldDagger);
        spartanWeaponryRecipes.add(goldGlaive);
        spartanWeaponryRecipes.add(goldHalberd);
        spartanWeaponryRecipes.add(goldHammer);
        spartanWeaponryRecipes.add(goldJavelin);
        spartanWeaponryRecipes.add(goldLance);
        spartanWeaponryRecipes.add(goldMace);
        spartanWeaponryRecipes.add(goldPike);
        spartanWeaponryRecipes.add(goldQuarterstaff);
        spartanWeaponryRecipes.add(goldTomahawk);
        spartanWeaponryRecipes.add(goldThrowingKnife);
        spartanWeaponryRecipes.add(goldWarhammer);
        spartanWeaponryRecipes.add(goldBattleaxe);
        spartanWeaponryRecipes.add(goldLongbow);
        spartanWeaponryRecipes.add(goldCrossbow);
        spartanWeaponryRecipes.add(stoneRapier);
        spartanWeaponryRecipes.add(stoneKatana);
        spartanWeaponryRecipes.add(stoneGreatsword);
        spartanWeaponryRecipes.add(stoneLongsword);
        spartanWeaponryRecipes.add(stoneSpear);
        spartanWeaponryRecipes.add(stoneSaber);
        spartanWeaponryRecipes.add(stoneBoomerang);
        spartanWeaponryRecipes.add(stoneDagger);
        spartanWeaponryRecipes.add(stoneGlaive);
        spartanWeaponryRecipes.add(stoneHalberd);
        spartanWeaponryRecipes.add(stoneHammer);
        spartanWeaponryRecipes.add(stoneJavelin);
        spartanWeaponryRecipes.add(stoneLance);
        spartanWeaponryRecipes.add(stoneMace);
        spartanWeaponryRecipes.add(stonePike);
        spartanWeaponryRecipes.add(stoneQuarterstaff);
        spartanWeaponryRecipes.add(stoneTomahawk);
        spartanWeaponryRecipes.add(stoneThrowingKnife);
        spartanWeaponryRecipes.add(stoneWarhammer);
        spartanWeaponryRecipes.add(stoneBattleaxe);
        spartanWeaponryRecipes.add(leatherLongbow);
        spartanWeaponryRecipes.add(leatherCrossbow);
        spartanWeaponryRecipes.add(woodenRapier);
        spartanWeaponryRecipes.add(woodenKatana);
        spartanWeaponryRecipes.add(woodenGreatsword);
        spartanWeaponryRecipes.add(woodenLongsword);
        spartanWeaponryRecipes.add(woodenSpear);
        spartanWeaponryRecipes.add(woodenSaber);
        spartanWeaponryRecipes.add(woodenBoomerang);
        spartanWeaponryRecipes.add(woodenDagger);
        spartanWeaponryRecipes.add(woodenGlaive);
        spartanWeaponryRecipes.add(woodenHalberd);
        spartanWeaponryRecipes.add(woodenHammer);
        spartanWeaponryRecipes.add(woodenJavelin);
        spartanWeaponryRecipes.add(woodenLance);
        spartanWeaponryRecipes.add(woodenMace);
        spartanWeaponryRecipes.add(woodenPike);
        spartanWeaponryRecipes.add(woodenQuarterstaff);
        spartanWeaponryRecipes.add(woodenTomahawk);
        spartanWeaponryRecipes.add(woodenThrowingKnife);
        spartanWeaponryRecipes.add(woodenWarhammer);
        spartanWeaponryRecipes.add(woodenBattleaxe);
        spartanWeaponryRecipes.add(woodenClub);
        spartanWeaponryRecipes.add(woodenLongbow);
        spartanWeaponryRecipes.add(woodenCrossbow);
        spartanWeaponryRecipes.add(copperRapier);
        spartanWeaponryRecipes.add(copperKatana);
        spartanWeaponryRecipes.add(copperGreatsword);
        spartanWeaponryRecipes.add(copperLongsword);
        spartanWeaponryRecipes.add(copperSpear);
        spartanWeaponryRecipes.add(copperSaber);
        spartanWeaponryRecipes.add(copperBoomerang);
        spartanWeaponryRecipes.add(copperDagger);
        spartanWeaponryRecipes.add(copperGlaive);
        spartanWeaponryRecipes.add(copperHalberd);
        spartanWeaponryRecipes.add(copperHammer);
        spartanWeaponryRecipes.add(copperJavelin);
        spartanWeaponryRecipes.add(copperLance);
        spartanWeaponryRecipes.add(copperMace);
        spartanWeaponryRecipes.add(copperPike);
        spartanWeaponryRecipes.add(copperQuarterstaff);
        spartanWeaponryRecipes.add(copperTomahawk);
        spartanWeaponryRecipes.add(copperThrowingKnife);
        spartanWeaponryRecipes.add(copperWarhammer);
        spartanWeaponryRecipes.add(copperBattleaxe);
        spartanWeaponryRecipes.add(copperLongbow);
        spartanWeaponryRecipes.add(copperCrossbow);
        spartanWeaponryRecipes.add(handle0);
        spartanWeaponryRecipes.add(handle1);
        spartanWeaponryRecipes.add(handle2);
        spartanWeaponryRecipes.add(pole0);
        spartanWeaponryRecipes.add(pole1);
        spartanWeaponryRecipes.add(pole2);
        spartanWeaponryRecipes.add(witherboneHandle);
        spartanWeaponryRecipes.add(witherbonePole);
    }

    public void populateWaystoneRecipes() {
        waystoneRecipes.add(warpedScroll);
    }

    public ShapedRecipe getFlintAxe() {
        return flintAxe;
    }

    public ShapedRecipe getFlintKnife() {
        return flintKnife;
    }

    public ShapedRecipe getFlintPickaxe() {
        return flintPickaxe;
    }

    public ShapedRecipe getFlintShovel() {
        return flintShovel;
    }

    public ShapedRecipe getFlintHoe() {
        return flintHoe;
    }

    public ShapedRecipe getCobblestone() {
        return cobblestone;
    }

    public ShapedRecipe getPlantString() {
        return plantString;
    }

    public ShapelessRecipe getFireDragonsteelIngot0() {
        return fireDragonsteelIngot0;
    }

    public ShapelessRecipe getIceDragonsteelIngot0() {
        return iceDragonsteelIngot0;
    }

    public ShapelessRecipe getLightningDragonsteelIngot0() {
        return lightningDragonsteelIngot0;
    }

    public ShapedRecipe getDragonscaleHelmetBlue() {
        return blueDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateBlue() {
        return blueDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsBlue() {
        return blueDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsBlue() {
        return blueDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetBronze() {
        return bronzeDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateBronze() {
        return bronzeDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsBronze() {
        return bronzeDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsBronze() {
        return bronzeDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetGray() {
        return grayDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateGray() {
        return grayDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsGray() {
        return grayDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsGray() {
        return grayDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetGreen() {
        return greenDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateGreen() {
        return greenDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsGreen() {
        return greenDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsGreen() {
        return greenDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetRed() {
        return redDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateRed() {
        return redDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsRed() {
        return redDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsRed() {
        return redDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetSapphire() {
        return sapphireDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateSapphire() {
        return sapphireDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsSapphire() {
        return sapphireDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsSapphire() {
        return sapphireDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetSilver() {
        return silverDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateSilver() {
        return silverDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsSilver() {
        return silverDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsSilver() {
        return silverDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetWhite() {
        return whiteDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateWhite() {
        return whiteDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsWhite() {
        return whiteDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsWhite() {
        return whiteDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetAmethyst() {
        return amethystDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateAmethyst() {
        return amethystDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsAmethyst() {
        return amethystDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsAmethyst() {
        return amethystDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetBlack() {
        return blackDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateBlack() {
        return blackDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsBlack() {
        return blackDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsBlack() {
        return blackDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetCopper() {
        return copperDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateCopper() {
        return copperDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsCopper() {
        return copperDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsCopper() {
        return copperDragonscaleBoots;
    }

    public ShapedRecipe getDragonscaleHelmetElectric() {
        return electricDragonscaleHelmet;
    }

    public ShapedRecipe getDragonscaleChestplateElectric() {
        return electricDragonscaleChestplate;
    }

    public ShapedRecipe getDragonscaleLeggingsElectric() {
        return electricDragonscaleLeggings;
    }

    public ShapedRecipe getDragonscaleBootsElectric() {
        return electricDragonscaleBoots;
    }

    public ShapedRecipe getTideGuardianHelmetBlue() {
        return blueTideGuardianHelmet;
    }

    public ShapedRecipe getTideGuardianChestplateBlue() {
        return blueTideGuardianChestplate;
    }

    public ShapedRecipe getTideGuardianLeggingsBlue() {
        return blueTideGuardianLeggings;
    }

    public ShapedRecipe getTideGuardianBootsBlue() {
        return blueTideGuardianBoots;
    }

    public ShapedRecipe getTideGuardianHelmetBronze() {
        return bronzeTideGuardianHelmet;
    }

    public ShapedRecipe getTideGuardianChestplateBronze() {
        return bronzeTideGuardianChestplate;
    }

    public ShapedRecipe getTideGuardianLeggingsBronze() {
        return bronzeTideGuardianLeggings;
    }

    public ShapedRecipe getTideGuardianBootsBronze() {
        return bronzeTideGuardianBoots;
    }

    public ShapedRecipe getTideGuardianHelmetDeepblue() {
        return deepblueTideGuardianHelmet;
    }

    public ShapedRecipe getTideGuardianChestplateDeepblue() {
        return deepblueTideGuardianChestplate;
    }

    public ShapedRecipe getTideGuardianLeggingsDeepblue() {
        return deepblueTideGuardianLeggings;
    }

    public ShapedRecipe getTideGuardianBootsDeepblue() {
        return deepblueTideGuardianBoots;
    }

    public ShapedRecipe getTideGuardianHelmetGreen() {
        return greenTideGuardianHelmet;
    }

    public ShapedRecipe getTideGuardianChestplateGreen() {
        return greenTideGuardianChestplate;
    }

    public ShapedRecipe getTideGuardianLeggingsGreen() {
        return greenTideGuardianLeggings;
    }

    public ShapedRecipe getideGuardianBootsGreen() {
        return greenDragonscaleBoots;
    }

    public ShapedRecipe getTideGuardianHelmetPurple() {
        return purpleTideGuardianHelmet;
    }

    public ShapedRecipe getTideGuardianChestplatePurple() {
        return purpleTideGuardianChestplate;
    }

    public ShapedRecipe getTideGuardianLeggingsPurple() {
        return purpleTideGuardianLeggings;
    }

    public ShapedRecipe getTideGuardianBootsPurple() {
        return purpleTideGuardianBoots;
    }

    public ShapedRecipe getTideGuardianHelmetRed() {
        return redTideGuardianHelmet;
    }

    public ShapedRecipe getTideGuardianChestplateRed() {
        return redTideGuardianChestplate;
    }

    public ShapedRecipe getTideGuardianLeggingsRed() {
        return redTideGuardianLeggings;
    }

    public ShapedRecipe getTideGuardianBootsRed() {
        return redTideGuardianBoots;
    }

    public ShapedRecipe getTideGuardianHelmetTeal() {
        return tealTideGuardianHelmet;
    }

    public ShapedRecipe getTideGuardianChestplateTeal() {
        return tealTideGuardianChestplate;
    }

    public ShapedRecipe getTideGuardianLeggingsTeal() {
        return tealTideGuardianLeggings;
    }

    public ShapedRecipe getTideGuardianBootsTeal() {
        return tealTideGuardianBoots;
    }

    public ShapedRecipe getDragonbonePickaxe() {
        return dragonbonePickaxe;
    }

    public ShapedRecipe getDragonboneAxe() {
        return dragonboneAxe;
    }

    public ShapedRecipe getDragonboneShovel() {
        return dragonboneShovel;
    }

    public ShapedRecipe getDragonboneHoe() {
        return dragonboneHoe;
    }

    public ShapedRecipe getDragonboneSword() {
        return dragonboneSword;
    }

    public ShapedRecipe getDragonboneBow() {
        return dragonboneBow;
    }

    public ShapelessRecipe getFlamedDragonboneSword() {
        return flamedDragonboneSword;
    }

    public ShapelessRecipe getIcedDragonboneSword() {
        return icedDragonboneSword;
    }

    public ShapelessRecipe getLightningDragonboneSword() {
        return lightningDragonboneSword;
    }

    public ShapedRecipe getBalloon() {
        return balloon;
    }

    public ShapedRecipe getCobaltShield() {
        return cobaltShield;
    }

    public ShapedRecipe getObsidianSkull() {
        return obsidianSkull;
    }

    public ShapedRecipe getSunglasses() {
        return sunglasses;
    }

    public ShapedRecipe getCrackedBlackDragonscale() {
        return crackedBlackDragonscale;
    }

    public ShapedRecipe getBlackDragonscale() {
        return blackDragonscale;
    }

    public ShapedRecipe getAnkhCharm() {
        return ankhCharm;
    }

    public ShapedRecipe getWarpedScroll() {
        return warpedScroll;
    }
}