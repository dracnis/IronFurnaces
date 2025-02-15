package ironfurnaces.items;

import ironfurnaces.IronFurnaces;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ItemXmas extends Item {


    public ItemXmas(Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(new TranslatableComponent("tooltip." + IronFurnaces.MOD_ID + ".xmas_right_click").setStyle(Style.EMPTY.applyFormat((ChatFormatting.GRAY))));
        tooltip.add(new TranslatableComponent("tooltip." + IronFurnaces.MOD_ID + ".xmas1").setStyle(Style.EMPTY.applyFormat((ChatFormatting.GRAY))));
        tooltip.add(new TranslatableComponent("tooltip." + IronFurnaces.MOD_ID + ".xmas2").setStyle(Style.EMPTY.applyFormat((ChatFormatting.GRAY))));
    }

}
