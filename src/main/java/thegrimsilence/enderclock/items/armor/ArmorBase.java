package thegrimsilence.enderclock.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import thegrimsilence.enderclock.EnderClock;
import thegrimsilence.enderclock.init.ModItems;
import thegrimsilence.enderclock.util.IHasModel;

public class ArmorBase extends ItemArmor implements IHasModel {

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		EnderClock.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
