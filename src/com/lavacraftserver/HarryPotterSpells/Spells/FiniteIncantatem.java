package com.lavacraftserver.HarryPotterSpells.Spells;

import org.bukkit.entity.Player;

import com.lavacraftserver.HarryPotterSpells.HPS;
import com.lavacraftserver.HarryPotterSpells.Spells.Spell.spell;
import com.lavacraftserver.HarryPotterSpells.Utils.Targeter;

@spell (
		name="Finite Incantatum",
		description="Unfreezes the target player",
		range=50,
		goThroughWalls=false
)
public class FiniteIncantatem extends Spell {

	@Override
	public void cast(Player p) {
		if (Targeter.getTarget(p, this.getRange(), this.canBeCastThroughWalls()) instanceof Player) {
			HPS.MiscListeners.petrificustotalus.remove(((Player) Targeter.getTarget(p, this.getRange(), this.canBeCastThroughWalls())).getName());
		} else {
			HPS.PM.warn(p, "This may only be used on a player or a mob.");
		}
	}
}

