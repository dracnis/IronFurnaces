package ironfurnaces.gui;

import ironfurnaces.container.BlockMillionFurnaceContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockMillionFurnaceScreen extends BlockIronFurnaceScreenBase<BlockMillionFurnaceContainer> {


    public BlockMillionFurnaceScreen(BlockMillionFurnaceContainer container, Inventory inv, Component name) {
        super(container, inv, name);
    }
}
