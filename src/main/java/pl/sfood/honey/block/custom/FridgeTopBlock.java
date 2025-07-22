package pl.sfood.honey.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import pl.sfood.honey.block.ModBlock;

public class FridgeTopBlock extends HorizontalFacingBlock {
    public static final MapCodec<FridgeTopBlock> CODEC = createCodec(FridgeTopBlock::new);
    private static final VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,32,16);

    public FridgeTopBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }
    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
        BlockPos below = pos.down();
        BlockState belowState = world.getBlockState(below);
        if (belowState.isOf(ModBlock.FRIDGE_BOTTOM)) {
            world.breakBlock(below, false);
        }
        return super.onBreak(world, pos, state, player);
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isOf(ModBlock.FRIDGE_BOTTOM);
    }
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return null;
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
