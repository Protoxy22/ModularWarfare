package com.modularwarfare.common.blocks;

import com.google.gson.annotations.SerializedName;

import net.minecraft.block.material.Material;

public enum MaterialType {
	
    @SerializedName("AIR") AIR,
    @SerializedName("GRASS") GRASS,
    @SerializedName("GROUND") GROUND,
    @SerializedName("WOOD") WOOD,
    @SerializedName("ROCK") ROCK,
    @SerializedName("IRON") IRON,
    @SerializedName("ANVIL") ANVIL,
    @SerializedName("WATER") WATER,
    @SerializedName("LAVA") LAVA,
    @SerializedName("LEAVES") LEAVES,
    @SerializedName("PLANTS") PLANTS,
    @SerializedName("VINE") VINE,
    @SerializedName("SPONGE") SPONGE,
    @SerializedName("CLOTH") CLOTH,
    @SerializedName("FIRE") FIRE,
    @SerializedName("SAND") SAND,
    @SerializedName("CIRCUITS") CIRCUITS,
    @SerializedName("CARPET") CARPET,
    @SerializedName("GLASS") GLASS,
    @SerializedName("REDSTONE_LIGHT") REDSTONE_LIGHT,
    @SerializedName("TNT") TNT,
    @SerializedName("CORAL") CORAL,
    @SerializedName("ICE") ICE,
    @SerializedName("PACKED_ICE") PACKED_ICE,
    @SerializedName("SNOW") SNOW,
    @SerializedName("CRAFTED_SNOW") CRAFTED_SNOW,
    @SerializedName("CACTUS") CACTUS,
    @SerializedName("CLAY") CLAY,
    @SerializedName("GOURD") GOURD,
    @SerializedName("DRAGON_EGG") DRAGON_EGG,
    @SerializedName("PORTAL") PORTAL,
    @SerializedName("CAKE") CAKE,
    @SerializedName("WEB") WEB;
    
    public Material toMaterial()
    {
    	switch(name().toLowerCase())
    	{
    	case "air": return Material.AIR;
    	case "grass": return Material.GRASS;
    	case "ground": return Material.GROUND;
    	case "wood": return Material.WOOD;
    	case "rock": return Material.ROCK;
    	case "iron": return Material.IRON;
    	case "anvil": return Material.ANVIL;
    	case "water": return Material.WATER;
    	case "lava": return Material.LAVA;
    	case "leaves": return Material.LEAVES;
    	case "plants": return Material.PLANTS;
    	case "vine": return Material.VINE;
    	case "sponge": return Material.SPONGE;
    	case "cloth": return Material.CLOTH;
    	case "fire": return Material.FIRE;
    	case "sand": return Material.SAND;
    	case "circuits": return Material.CIRCUITS;
    	case "carpet": return Material.CARPET;
    	case "glass": return Material.GLASS;
    	case "redstone_light": return Material.REDSTONE_LIGHT;
    	case "tnt": return Material.TNT;
    	case "coral": return Material.CORAL;
    	case "ice": return Material.ICE;
    	case "packed_ice": return Material.PACKED_ICE;
    	case "snow": return Material.SNOW;
    	case "crafted_snow": return Material.CRAFTED_SNOW;
    	case "cactus": return Material.CACTUS;
    	case "clay": return Material.CLAY;
    	case "gourd": return Material.GOURD;
    	case "dragon_egg": return Material.DRAGON_EGG;
    	case "portal": return Material.PORTAL;
    	case "cake": return Material.CAKE;
    	case "web": return Material.WEB;
    	}
		return null;
    }

}
