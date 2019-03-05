package com.matoyak.suppergerrie.items;

import net.minecraft.item.Item;

public class ItemBasic extends Item {
	public ItemBasic(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);  // NEVER change this after assigning it.
	}
}
