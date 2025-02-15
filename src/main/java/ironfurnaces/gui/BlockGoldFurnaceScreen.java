package ironfurnaces.gui;

import ironfurnaces.container.BlockGoldFurnaceContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockGoldFurnaceScreen extends BlockIronFurnaceScreenBase<BlockGoldFurnaceContainer> {


    public BlockGoldFurnaceScreen(BlockGoldFurnaceContainer container, Inventory inv, Component name) {
        super(container, inv, name);
    }
}
