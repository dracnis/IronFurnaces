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

public class ItemAugmentSpeed extends ItemAugment {

    public ItemAugmentSpeed(Item.Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        tooltip.add(new TranslatableComponent("tooltip." + IronFurnaces.MOD_ID + ".augment_speed_pro").setStyle(Style.EMPTY.applyFormat((ChatFormatting.GREEN))));
        tooltip.add(new TranslatableComponent("tooltip." + IronFurnaces.MOD_ID + ".augment_speed_con").setStyle(Style.EMPTY.applyFormat(ChatFormatting.DARK_RED)));
    }



}
