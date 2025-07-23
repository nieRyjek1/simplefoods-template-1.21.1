package pl.sfood.honey.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class ShelfBlock extends HorizontalFacingBlock {
    public static final MapCodec<ShelfBlock> CODEC = createCodec(ShelfBlock::new);
    private static final VoxelShape SHAPE_NORTH = Block.createCuboidShape(0,0,6,16,32,16);
    private static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape(0,0,0,16,32,10);
    private static final VoxelShape SHAPE_EAST = Block.createCuboidShape(0,0,0,10,32,16);
    private static final VoxelShape SHAPE_WEST = Block.createCuboidShape(6,0,0,16,32,16);

    public ShelfBlock(Settings settings) {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());

    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(FACING);
    }

}
