package pl.sfood.honey.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import pl.sfood.honey.block.ModBlock;

public class FridgeBottomBlock extends HorizontalFacingBlock {
    public static final MapCodec<FridgeBottomBlock> CODEC = createCodec(FridgeBottomBlock::new);
    private static final VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,16,16);

    public FridgeBottomBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH ));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos posAbove = ctx.getBlockPos().up();
        if (!ctx.getWorld().getBlockState(posAbove).isReplaceable()) {
            return null;
        }
        Direction facing = ctx.getHorizontalPlayerFacing().getOpposite();
        return this.getDefaultState().with(FACING, facing);
    }
    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity player, ItemStack itemStack) {
        super.onPlaced(world, pos, state, player, itemStack);
        BlockPos topPos = pos.up();
        world.setBlockState(topPos, ModBlock.FRIDGE_TOP.getDefaultState().with(FACING, state.get(FACING)));

    }
    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
        BlockPos topPos = pos.up();
        BlockState topState = world.getBlockState(topPos);
        if (topState.isOf(ModBlock.FRIDGE_TOP)) {
            world.breakBlock(topPos, false);
        }
        return super.onBreak(world, pos, state, player);
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
