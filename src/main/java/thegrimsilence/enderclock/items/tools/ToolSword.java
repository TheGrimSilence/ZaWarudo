package thegrimsilence.enderclock.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import thegrimsilence.enderclock.EnderClock;
import thegrimsilence.enderclock.util.IHasModel;

public class ToolSword extends ItemSword implements IHasModel {
	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	public void registerModels() {
		EnderClock.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
