package com.lavacraftserver.HarryPotterSpells.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;
import com.lavacraftserver.HarryPotterSpells.HPS;

public class SpellList implements CommandExecutor {

}

     
	 

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if ((cmd.getName().equalsIgnoreCase("spelllist")) && 
    		
    	      ((sender instanceof Player))) {
    	      Player p = (Player)sender;
    	      {
                      sender.sendMessage(ChatColor.GOLD + "-= Spells =-");
                      sender.sendMessage(ChatColor.RED + "Use /SpellInfo [Spell] to check the description of the spells");
                      sender.sendMessage(ChatColor.GOLD + " Aguamenti ");
                      sender.sendMessage(ChatColor.GOLD + " Alarte Ascendare ");
                      sender.sendMessage(ChatColor.GOLD + " Avada Kedavra ");
                      sender.sendMessage(ChatColor.GOLD + " Confringo ");
                      sender.sendMessage(ChatColor.GOLD + " Confundo ");
                      sender.sendMessage(ChatColor.GOLD + " Deprimo ");
                      sender.sendMessage(ChatColor.GOLD + " Episkey ");
                      sender.sendMessage(ChatColor.GOLD + " Evanesco ");
                      sender.sendMessage(ChatColor.GOLD + " Expelliarmus ");
                      sender.sendMessage(ChatColor.GOLD + " Multicorfors ");
                      sender.sendMessage(ChatColor.GOLD + " Reducto ");
                      sender.sendMessage(ChatColor.GOLD + " Sonorus ");
                      sender.sendMessage(ChatColor.GOLD + " Spongify ");
                      sender.sendMessage(ChatColor.GOLD + " Wingardium Leviosa ");

                      return true;
              }
           
              }
            
	  

    return true;
    
  }
}
