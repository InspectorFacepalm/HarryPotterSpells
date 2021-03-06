package com.lavacraftserver.HarryPotterSpells.Spells;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;

import com.lavacraftserver.HarryPotterSpells.HPS;
import com.lavacraftserver.HarryPotterSpells.Utils.Targeter;
import com.lavacraftserver.HarryPotterSpells.Spells.Spell.spell;

@spell (
	name="Aguamenti",
	description="Places water at your target block",
	range=50,
	goThroughWalls=false
)
public class Aguamenti extends Spell {
	
	public void cast(Player p) {
		Block hit = p.getTargetBlock(Targeter.getTransparentBlocks(), 50);
		float dir = (float)Math.toDegrees(Math.atan2(p.getLocation().getBlockX() - hit.getX(), hit.getZ() - p.getLocation().getBlockZ()));
		Block b = hit.getRelative(getClosestFace(dir));
		if(!(hit.getType() == Material.AIR)) {
			b.setType(Material.WATER);
		} else {
			HPS.PM.warn(p, "You cannot place water here.");
		}
	}
	
	public BlockFace getClosestFace(float direction) {
        direction = direction % 360;
        if(direction < 0)
            direction += 360;
        direction = Math.round(direction / 45);
        switch((int)direction){

            case 0:
                return BlockFace.EAST;
            case 1:
                return BlockFace.SOUTH_EAST;
            case 2:
                return BlockFace.SOUTH;
            case 3:
                return BlockFace.SOUTH_WEST;
            case 4:
                return BlockFace.WEST;
            case 5:
                return BlockFace.NORTH_WEST;
            case 6:
                return BlockFace.NORTH;
            case 7:
                return BlockFace.NORTH_EAST;
            default:
                return BlockFace.EAST;

        }
    }

}
