package com.bokuraneko.asnekotweak.core.init;

import com.bokuraneko.asnekotweak.asnekotewak;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class iteminit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			asnekotewak.MOD_ID);

	public static final RegistryObject<Item> crescent_scythe = ITEMS.register("crescent_scythe",
			() -> Item(new Item.Properties().group(ItemGroup.TAB_COMBAT)));
}
