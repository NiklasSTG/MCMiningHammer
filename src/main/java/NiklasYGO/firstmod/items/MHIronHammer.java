package NiklasYGO.firstmod.items;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MHIronHammer extends ItemPickaxe{
    protected MHIronHammer(ToolMaterial material) {
        super(material);

    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase Entity) {
        System.out.println("HALLO! I BIMS");
        return super.onBlockDestroyed(stack, world, block, x, y, z, Entity);
    }
}
