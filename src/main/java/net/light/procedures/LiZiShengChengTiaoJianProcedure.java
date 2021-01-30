package net.light.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.light.LightModElements;

import java.util.Map;

@LightModElements.ModElement.Tag
public class LiZiShengChengTiaoJianProcedure extends LightModElements.ModElement {
	public LiZiShengChengTiaoJianProcedure(LightModElements instance) {
		super(instance, 10);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure LiZiShengChengTiaoJian!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure LiZiShengChengTiaoJian!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure LiZiShengChengTiaoJian!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure LiZiShengChengTiaoJian!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getLightValue()) <= 10)) {
			return (true);
		}
		return (false);
	}
}
